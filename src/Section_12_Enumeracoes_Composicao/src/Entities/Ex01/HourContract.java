package Section_12_Enumeracoes_Composicao.src.Entities.Ex01;

import java.time.LocalDateTime;

public class HourContract {
    private LocalDateTime date;
    private Double valuePerHour;
    private  Integer hours;

    public HourContract(LocalDateTime date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalValue(){
        return valuePerHour * hours;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "HourContract{" +
                "date=" + date +
                ", valuePerHour=" + valuePerHour +
                ", hours=" + hours +
                '}';
    }
}
