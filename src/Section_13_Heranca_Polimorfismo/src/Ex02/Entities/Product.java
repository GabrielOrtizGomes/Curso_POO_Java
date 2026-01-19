package Section_13_Heranca_Polimorfismo.src.Ex02.Entities;

public class Product {
    protected String name;
    protected Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String priceTag(){
        return String.format("%s $ %.2f",name,price);
    }
}
