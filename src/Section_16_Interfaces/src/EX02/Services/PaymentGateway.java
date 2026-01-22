package Section_16_Interfaces.src.EX02.Services;

import Section_16_Interfaces.src.EX02.Entities.Contract;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentGateway {

    public BigDecimal paymentFee(BigDecimal amount);

    public BigDecimal interest(BigDecimal amount,Integer months);
}
