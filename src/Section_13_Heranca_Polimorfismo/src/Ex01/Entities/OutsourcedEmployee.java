package Section_13_Heranca_Polimorfismo.src.Ex01.Entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return (hours * valuePerHour) + (additionalCharge *1.1);
    }
}
