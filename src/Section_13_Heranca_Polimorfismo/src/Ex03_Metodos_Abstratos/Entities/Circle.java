package Section_13_Heranca_Polimorfismo.src.Ex03_Metodos_Abstratos.Entities;


import Section_13_Heranca_Polimorfismo.src.Ex03_Metodos_Abstratos.Entities.Enum.Color;

public class Circle extends Shape{
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area(){
        return Math.PI * Math.pow(radius,2);
    }
}
