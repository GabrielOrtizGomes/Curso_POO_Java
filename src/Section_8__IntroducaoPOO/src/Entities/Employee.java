package Section_8__IntroducaoPOO.src.Entities;

public class Employee {
    private String name;
    private Double grossSalary;
    private Double tax;

    public Double netSalary(){
        Double netSalary = this.grossSalary - this.tax;
        return netSalary;
    }

    public void increaseSalary(Double percentage){
        Double increaseSalay = (this.grossSalary * (percentage/100));
        setGrossSalary(this.grossSalary + increaseSalay);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s, $ %.2f", name, netSalary());
    }
}
