package Section_16_Interfaces.src.EX02.Services;

import Section_16_Interfaces.src.EX02.Entities.Contract;
import Section_16_Interfaces.src.EX02.Entities.Installment;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ContractService {
    private final PaymentGateway paymentGateway;

    public ContractService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }


    public void buildInstallments(Contract contract){
            int installmentCount = contract.getInstallmentCount();
            BigDecimal installmentAmount = contract.getContractValue().divide(BigDecimal.valueOf(installmentCount), RoundingMode.HALF_EVEN);
            LocalDate contractLocalDate = contract.getDate();
            for (int i=1; i<=installmentCount;i++){
                LocalDate installmentLocalDate = contractLocalDate.plusMonths(i);
                BigDecimal installmentInterest = paymentGateway.interest(installmentAmount,i);
                BigDecimal installmentFee = paymentGateway.paymentFee(installmentAmount.add(installmentInterest));
                contract.addInstallment(new Installment(installmentLocalDate, installmentAmount.add(installmentFee).add(installmentInterest)));
            }
    }

    public void printInstallments(List<Installment> installments){
        StringBuilder sb = new StringBuilder("Parcelas: ");
        for (Installment installment : installments){
            sb.append(String.format("%n%s", installment.toString()));
        }
        System.out.println(sb);
    }

}
