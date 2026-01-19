package Section_13_Heranca_Polimorfismo.src.Ex01.Entities;

public class Employee {
    private String name;
    protected Integer hours;
    protected Double valuePerHour;


    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return hours * valuePerHour;
    }

    public String getName() {
        return name;
    }

}
