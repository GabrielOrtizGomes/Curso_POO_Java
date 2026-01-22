package Section_16_Interfaces.src.EX02.Services;


import java.math.BigDecimal;

public class PayPalPaymentGateway implements PaymentGateway  {

    public BigDecimal paymentFee(BigDecimal amount){
        return amount.multiply(BigDecimal.valueOf(0.02));
    };

    public BigDecimal interest(BigDecimal amount,Integer month){
        return amount.multiply(BigDecimal.valueOf(0.01)).multiply(BigDecimal.valueOf(month));
    };



}
