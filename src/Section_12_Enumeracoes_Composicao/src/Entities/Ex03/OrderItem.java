package Section_12_Enumeracoes_Composicao.src.Entities.Ex03;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subTotal(){
        return product.getPrice() * quantity;
    }


    @Override
    public String toString() {
        return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f",product.getName(),product.getPrice(),quantity, subTotal());
    }
}
