package Section_12_Enumeracoes_Composicao.src.Entities.Ex03;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;
    private ArrayList<Order> orders;


    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.orders = new ArrayList<Order>();
    }

    public  void addOrder(Order order){
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
