package Section_16_Interfaces.src.EX02.Entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private LocalDate date;
    private BigDecimal value;


    public Installment(LocalDate date, BigDecimal value) {
        this.date = date;
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%s - %.2f", getDate().format(dtfmt), getValue());
    }
}
