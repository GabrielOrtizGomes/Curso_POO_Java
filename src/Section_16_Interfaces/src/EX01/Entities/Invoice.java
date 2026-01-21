package Section_16_Interfaces.src.EX01.Entities;

import java.math.BigDecimal;

public class Invoice {
    private BigDecimal basicPayment;
    private BigDecimal tax;

    public Invoice(BigDecimal basicPayment, BigDecimal tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public BigDecimal getBasicPayment() {
        return basicPayment;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public BigDecimal getTotalPayment() {
        return basicPayment.add(tax);
    }

}
