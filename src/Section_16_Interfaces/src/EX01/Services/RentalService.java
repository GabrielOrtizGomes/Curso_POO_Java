package Section_16_Interfaces.src.EX01.Services;

import Section_16_Interfaces.src.EX01.Entities.CarRental;
import Section_16_Interfaces.src.EX01.Entities.Invoice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.Instant;

public class RentalService {
    private BigDecimal pricePerHour;
    private BigDecimal PricePerDay;
    private TaxService tax;

    public RentalService(BigDecimal pricePerHour, BigDecimal PricePerDay, TaxService tax) {
        this.pricePerHour = pricePerHour;
        this.PricePerDay = PricePerDay;
        this.tax = tax;
    }

    public void processInvoice(CarRental carRental){
        Instant start = carRental.getStart();
        Instant finish = carRental.getFinish();

        Duration duration = Duration.between(start, finish);
        BigDecimal hours =  BigDecimal.valueOf(duration.toMinutes()).divide(BigDecimal.valueOf(60.0),RoundingMode.CEILING);
        BigDecimal basicPayment = getBasicPayment(hours);

        carRental.setInvoice(new Invoice(basicPayment,getTax().tax(basicPayment)));
    }

    public BigDecimal getBasicPayment(BigDecimal hours){

        if(hours.compareTo(BigDecimal.valueOf(12)) >= 0){
            BigDecimal days = hours.divide(BigDecimal.valueOf(24),0, RoundingMode.CEILING);
            return   days.multiply(getPricePerDay());
        } else {
            BigDecimal roundedHours = hours.setScale(0,RoundingMode.CEILING);
            return roundedHours.multiply(getPricePerHour());
        }
    }

    public BigDecimal getPricePerDay() {
        return PricePerDay;
    }

    public TaxService getTax() {
        return tax;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }
}
