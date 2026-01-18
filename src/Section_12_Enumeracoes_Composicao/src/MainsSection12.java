package Section_12_Enumeracoes_Composicao.src;


import Section_12_Enumeracoes_Composicao.src.Entities.Ex03.Client;
import Section_12_Enumeracoes_Composicao.src.Entities.Ex03.Enum.OrderStatus;
import Section_12_Enumeracoes_Composicao.src.Entities.Ex03.Order;
import Section_12_Enumeracoes_Composicao.src.Entities.Ex03.OrderItem;
import Section_12_Enumeracoes_Composicao.src.Entities.Ex03.Product;

import java.time.Instant;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainsSection12 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //EX RESOLVIDO 01

        /*System.out.print("Enter department´s name: ");
        String workerDepartmentsName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        Double workerBaseSalary = sc.nextDouble();
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        Departament workerDepartment = new Departament(workerDepartmentsName);

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, workerDepartment);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i<n;i++){
            System.out.printf("Enter contract #%d data:%n",i+1);
            sc.nextLine();
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDateTime data = LocalDate.parse(sc.nextLine(), fmt).atStartOfDay();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            HourContract contract = new HourContract(data, valuePerHour , duration);
            System.out.println(contract.getDate().toString());

            worker.addContract(contract);
        }

        sc.nextLine();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthCalcIncome = sc.nextLine();
        String[] monthCalcIncomeArray = monthCalcIncome.split("/");
        Integer mes =  Integer.parseInt(monthCalcIncomeArray[0]);
        Integer ano = Integer.parseInt(monthCalcIncomeArray[1]);
        Double workerIncome = worker.income(ano,mes);

        System.out.printf("Name: %s%n",worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartament().toString());
        System.out.printf("Income for %s: %.2f", monthCalcIncome, workerIncome);*/

        //EX RESOLVIDO 02

        /*DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime datePost01 = LocalDateTime.parse("21/06/2018 13:05:44",fmt);
        Instant momentPost01 = datePost01.atZone(ZoneId.systemDefault()).toInstant();
        String titlePost01 = "Trabeling New Zealand";
        String contentPost01 = "I´m going to visit this wonderful country!";
        Integer likesPost01 = 12;

        Post post01 = new Post(momentPost01, titlePost01,contentPost01, likesPost01);
        post01.addComment(new Comment("Have a nice trip"));
        post01.addComment(new Comment("Wow that´s awesome!"));

        LocalDateTime datePost02 = LocalDateTime.parse("28/07/2018 23:14:19",fmt);
        Instant momentPost02 = datePost02.atZone(ZoneId.systemDefault()).toInstant();
        String titlePost02 = "Good night guys";
        String contentPost02 = "See you tomorrow";
        Integer likesPost02 = 5;

        Post post02 = new Post(momentPost02, titlePost02,contentPost02, likesPost02);
        post02.addComment(new Comment("Good night"));
        post02.addComment(new Comment("May the Force be with you"));


        *//*LocalDateTime datePost02 = LocalDateTime.parse("28/07/2018 23:14:19",fmt);*//*
        Instant momentPost03 = Instant.now();
        String titlePost03 = "The most incredible and wonderful woman.";
        String contentPost03 = "Minha namorada, Gio, é a mulher mais incrível e maravilhosa que eu já conheci. Tudo nela vibra: sua energia, sua força, sua beleza, seu jeito — absolutamente tudo o que a envolve. Ela me motiva e me dá a coragem de mover montanhas quando a tenho ao meu lado. Admiro profundamente a minha princesa e tenho orgulho de chamá-la de minha.";
        Integer likesPost03 = 1;

        Post post03 = new Post(momentPost03, titlePost03,contentPost03, likesPost03);
        post03.addComment(new Comment("Te amo mais que tudo minha Ômega"));
        post03.addComment(new Comment("Você é a minha luz"));


        System.out.println(post01.toString());

        System.out.printf("%n%n%s", post02.toString());


        System.out.printf("%n%n%s", post03.toString());*/

        //EX RESOLVIDO 03

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate clientBirthDate = LocalDate.parse(sc.nextLine(), fmt);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());
        Client client = new Client(clientName,clientEmail,clientBirthDate);
        Order order = new Order(Instant.now(),orderStatus,client);
        System.out.println("Enter 1 to add items to this order or 2 to remove them.");
        int choice = sc.nextInt();

        int n;
        switch (choice){
            case 1:
                System.out.print("How many items to this order: ");
                n = sc.nextInt();
                for (int i = 0;i<n;i++){
                    sc.nextLine();
                    System.out.printf("Enter #%d item data: %n", i+1);
                    System.out.print("Product name: ");
                    String productName = sc.nextLine();
                    System.out.print("Product price: ");
                    Double productPrice = sc.nextDouble();
                    System.out.print("Quantity: ");
                    Integer orderItemQuantity = sc.nextInt();

                    Product product = new Product(productName, productPrice);
                    OrderItem orderItem = new OrderItem(orderItemQuantity,productPrice,product);
                    order.addItem(orderItem);
                }
                client.addOrder(order);
                break;
            case 2:
                System.out.print("How many items do you want to remove from this order? ");
                n = sc.nextInt();
                for (int i = 0;i<n;i++){
                    sc.nextLine();
                    System.out.printf("Enter #%d item data: ", i+1);
                    System.out.print("Product name: ");
                    String productName = sc.nextLine();
                    System.out.print("Product price: ");
                    Double productPrice = sc.nextDouble();
                    System.out.print("Quantity: ");
                    Integer orderItemQuantity = sc.nextInt();

                    Product product = new Product(productName, productPrice);
                    OrderItem orderItem = new OrderItem(orderItemQuantity,productPrice,product);
                    order.removeItem(orderItem);
                }
                break;
        }
        System.out.println(order);

    }
}
