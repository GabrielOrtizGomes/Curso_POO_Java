package Section_13_Heranca_Polimorfismo.src.Ex02.Entities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    Instant manufactureDate;

    public UsedProduct(String name, Double price, Instant manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime locaDateTime = LocalDateTime.ofInstant(manufactureDate, ZoneId.systemDefault());

        return String.format("%s (used) $ %.2f (Manufacture date: %s)",name,price,locaDateTime.format(fmt));
    }
}
