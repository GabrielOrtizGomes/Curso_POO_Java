package Section_13_Heranca_Polimorfismo.src.Ex04.Entities;

public abstract class Pessoa {
    protected String name;
    protected Double rendaAnual;

    public Pessoa(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public String getName() {
        return name;
    }

    public abstract Double calcImpost();
}
