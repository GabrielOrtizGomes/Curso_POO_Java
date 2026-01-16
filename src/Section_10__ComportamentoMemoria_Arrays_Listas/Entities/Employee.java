package Section_10__ComportamentoMemoria_Arrays_Listas.Entities;

public class Employee {
    private int id;
    private String name;
    private double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percent){
        this.salary += salary * (percent/100);
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f%n", id, name, salary);
    }
}
