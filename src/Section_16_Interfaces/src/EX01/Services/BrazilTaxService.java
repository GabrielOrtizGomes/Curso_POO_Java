package Section_16_Interfaces.src.EX01.Services;

import java.math.BigDecimal;

public class BrazilTaxService implements TaxService  {

    public BrazilTaxService() {
    }

    public BigDecimal tax(BigDecimal amount){
        if(amount.compareTo(BigDecimal.valueOf(100)) > 0){
            return amount.multiply(BigDecimal.valueOf(0.15));
        }else {
            return amount.multiply(BigDecimal.valueOf(0.20));
        }
    };
}
