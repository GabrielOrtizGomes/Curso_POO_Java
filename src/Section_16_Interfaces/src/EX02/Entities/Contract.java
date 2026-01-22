package Section_16_Interfaces.src.EX02.Entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int number;
    private LocalDate date;
    private BigDecimal contractValue;
    private int installmentCount;
    private List<Installment> installments;

    public Contract(int number, LocalDate date, BigDecimal contractValue, int installmentCount) {
        this.number = number;
        this.date = date;
        this.contractValue = contractValue;
        this.installmentCount = installmentCount;
        this.installments = new ArrayList<Installment>();
    }

    public void addInstallment (Installment installment){
        if (installments.size() >= installmentCount) {
            throw new IllegalStateException("Installment limit exceeded");
        }
        installments.add(installment);
    }

    public List<Installment> getInstallments() {
        return List.copyOf(installments);
    }

    public int getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getContractValue() {
        return contractValue;
    }

    public int getInstallmentCount() {
        return installmentCount;
    }

}
