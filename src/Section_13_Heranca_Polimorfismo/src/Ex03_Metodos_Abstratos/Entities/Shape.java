package Section_13_Heranca_Polimorfismo.src.Ex03_Metodos_Abstratos.Entities;


import Section_13_Heranca_Polimorfismo.src.Ex03_Metodos_Abstratos.Entities.Enum.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract Double area();
}
