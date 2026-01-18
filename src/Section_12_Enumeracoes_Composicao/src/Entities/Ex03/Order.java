package Section_12_Enumeracoes_Composicao.src.Entities.Ex03;

import Section_12_Enumeracoes_Composicao.src.Entities.Ex03.Enum.OrderStatus;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    private Instant moment;
    private OrderStatus orderStatus;
    private Client client;
    private ArrayList<OrderItem> orderItems;

    public Order(Instant moment, OrderStatus orderStatus, Client client) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
        this.orderItems = new ArrayList<OrderItem>();
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }
    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    public Double total(){
        Double total = 0.0;
        for (OrderItem item : orderItems){
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("%nORDER SUMMARY: %n"));
        DateTimeFormatter fmtLocalDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmtLocalDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime dateTime = LocalDateTime.ofInstant(moment, ZoneId.systemDefault());
        sb.append(String.format("Order moment: %s%n",dateTime.format(fmtLocalDateTime)));
        sb.append(String.format("Order status: %s%n", orderStatus.toString()));
        sb.append(String.format("Client: %s (%s) - %s%n",client.getName(),client.getBirthDate().format(fmtLocalDate),client.getEmail()));
        sb.append(String.format("Order items: %n"));
        if(!orderItems.isEmpty()){
            for (OrderItem orderItem: orderItems){
                sb.append(String.format("%s %n",orderItem.toString()));
            }
            sb.append(String.format("Total price: $%.2f",total() ));
        }
        return sb.toString();
    }
}
