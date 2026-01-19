package Section_13_Heranca_Polimorfismo.src.Ex03_Metodos_Abstratos.Entities;


import Section_13_Heranca_Polimorfismo.src.Ex03_Metodos_Abstratos.Entities.Enum.Color;

public class Rectangle extends Shape{
    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area(){
        return width*height;
    }
}
