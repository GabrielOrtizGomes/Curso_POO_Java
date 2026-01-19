package Section_13_Heranca_Polimorfismo.src;


import Section_13_Heranca_Polimorfismo.src.Ex01.Entities.Employee;
import Section_13_Heranca_Polimorfismo.src.Ex01.Entities.OutsourcedEmployee;
import Section_13_Heranca_Polimorfismo.src.Ex02.Entities.ImportedProduct;
import Section_13_Heranca_Polimorfismo.src.Ex02.Entities.Product;
import Section_13_Heranca_Polimorfismo.src.Ex02.Entities.UsedProduct;
import Section_13_Heranca_Polimorfismo.src.Ex03_Metodos_Abstratos.Entities.Circle;
import Section_13_Heranca_Polimorfismo.src.Ex03_Metodos_Abstratos.Entities.Enum.Color;
import Section_13_Heranca_Polimorfismo.src.Ex03_Metodos_Abstratos.Entities.Rectangle;
import Section_13_Heranca_Polimorfismo.src.Ex03_Metodos_Abstratos.Entities.Shape;
import Section_13_Heranca_Polimorfismo.src.Ex04.Entities.Pessoa;
import Section_13_Heranca_Polimorfismo.src.Ex04.Entities.PessoaFisica;
import Section_13_Heranca_Polimorfismo.src.Ex04.Entities.PessoaJuridica;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MainSection13 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //EX01

        /*System.out.print("Enter the number of employees: ");
        int n  = sc.nextInt();
        ArrayList<Employee> employees = new ArrayList<Employee>();

        for (int i =0; i<n; i++){
            sc.nextLine();
            System.out.printf("Employee #%d data:%n",i+1);
            System.out.print("Outsourced(y/n)? ");
            char outSourced = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String employeeName = sc.nextLine();
            System.out.print("Hours: ");
            Integer employeeHours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double employeeValuePerhour = sc.nextDouble();

            if (outSourced == 'y'){
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();

                Employee employeeOutsourced = new OutsourcedEmployee(employeeName, employeeHours, employeeValuePerhour, additionalCharge);
                employees.add(employeeOutsourced);
            } else {
                Employee employee = new Employee(employeeName, employeeHours, employeeValuePerhour);
                employees.add(employee);
            }
        }

        System.out.println("PAYMENTS: ");
        for (Employee employee : employees){
            System.out.printf("%s - $ %.2f%n", employee.getName(),employee.payment());
        }*/

        //EX02
        /*System.out.print("Enter the number of products: ");
        int n = sc.nextInt();;
        sc.nextLine();
        ArrayList<Product> products = new ArrayList<Product>();

        for (int i = 0; i<n;i++){
            System.out.printf("Product #%d data:%n", i+1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String productName =sc.nextLine();
            System.out.print("Price: ");
            Double productPrice = sc.nextDouble();

            Product product;
            if(typeProduct == 'i'){
                System.out.print("Custom fee:");
                Double customsFee = sc.nextDouble();
                product = new ImportedProduct(productName, productPrice, customsFee);

            } else if (typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                DateTimeFormatter  fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                sc.nextLine();
                LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
                product = new UsedProduct(productName, productPrice, date.atStartOfDay(ZoneId.systemDefault()).toInstant());
            } else {
                product = new Product(productName, productPrice);
            }
            products.add(product);
        }

        System.out.println("PRICE TAGS: ");
        for (Product product : products){
            System.out.println(product.priceTag());
        }*/

        //EX03

        /*System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        for (int i = 0; i<n;i++){
            System.out.printf("Shape #%d data: %n", i+1);
            System.out.print("Rectangle or Circle (r/c)? ");
            char typeOfShape = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine().toUpperCase());
            Shape shape;

            if(typeOfShape == 'r'){
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                shape = new Rectangle(color,width, height);
            } else if (typeOfShape == 'c'){
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shape = new Circle(color,radius);
            } else {
                System.out.println("Digite apenas r ou c");
                i--;
                continue;
            }
            shapes.add(shape);
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapes){
            System.out.printf("%.2f",shape.area());
        }*/

        //EX04

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        ArrayList<Pessoa> payers = new ArrayList<Pessoa>();

        for (int i = 0; i<n;i++){
            System.out.printf("Tax payer #%d data:", i+1);
            System.out.print("Individual or company (i/c)? ");
            char typeOfPeople = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String peopleName = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            Pessoa people;
            if (typeOfPeople == 'i'){
                System.out.print("Health expeditures: ");
                Double healthExpeditures = sc.nextDouble();
                people = new PessoaFisica(peopleName, anualIncome, healthExpeditures);
                payers.add(people);
            } else if (typeOfPeople == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                people = new PessoaJuridica(peopleName, anualIncome, numberOfEmployees );
                payers.add(people);
            }
        }
            System.out.println("TAXES PAID: ");
            Double totalTaxes = 0.0;
            for (Pessoa pessoa : payers){
                System.out.printf("%s: $ %.2f%n", pessoa.getName(), pessoa.calcImpost());
                totalTaxes += pessoa.calcImpost();
            }

            System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);

    }
}
