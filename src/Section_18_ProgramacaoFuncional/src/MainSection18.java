package Section_18_ProgramacaoFuncional.src;



import Section_18_ProgramacaoFuncional.src.EX05.Entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;



public class MainSection18 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        //EX01

        /*List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", BigDecimal.valueOf(900)));
        list.add(new Product("Mouse", BigDecimal.valueOf(50)));
        list.add(new Product("Tablet", BigDecimal.valueOf(350.50)));
        list.add(new Product("HD Case", BigDecimal.valueOf(80.90)));*/

        //Predicate<Product> isMaiorQue100 = n -> n.getPrice().compareTo(BigDecimal.valueOf(100)) >= 0;

        //List<Product> result = list.stream().filter(isMaiorQue100).toList();
        /*List<Product> result = list.stream().filter(n -> n.getPrice().compareTo(BigDecimal.valueOf(100)) <= 0).toList();

        for (Product product : result){
            System.out.println(product);
        }

        list.removeIf(n -> n.getPrice().compareTo(BigDecimal.valueOf(100)) >= 0);

        for (Product product : list){
            System.out.println(product);
        }*/

        //EX02

        //list.forEach(product -> product.setPrice(product.getPrice().add(product.getPrice().multiply(BigDecimal.valueOf(0.1)))));

        /*for (Product product : list){
            System.out.println(product);
        }*/

        //list.forEach(System.out::println);

        //EX03

        /*List<Product> result = list.stream().map(product -> new Product(product.getName().toUpperCase(), product.getPrice())).collect(Collectors.toList());

        result.forEach(System.out::println);*/

        //EX04

/*        String path = "C:\\Users\\Gabriel Ortiz\\Desktop\\CursoPOOJava\\src\\Section_18_ProgramacaoFuncional\\src\\EX04\\products.csv";

        System.out.print("Enter full file path: ");
        //String path = sc.nextLine();
        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null){
                String[] fields = line.split(",");
                products.add(new Product(fields[0], new BigDecimal(fields[1])));
            }
        } catch (IOException e){
            System.out.println("Erro ao carregar arquivo: " + e);
        }

        BigDecimal priceAverage = products.stream()
                .map(product -> product.getPrice())
                .reduce(BigDecimal.ZERO,(a, b) -> a.add(b))
                .divide(BigDecimal.valueOf(products.size()), RoundingMode.HALF_EVEN);

        System.out.println(priceAverage);

        //List<String> productsMinAverage = products.stream().filter(product -> product.getPrice().compareTo(priceAverage) < 0).map(product -> product.getName()).collect(Collectors.toList());


        List<String> productsMinAverage = products.stream()
                .filter(product -> product.getPrice()
                        .compareTo(priceAverage) < 0)
                .sorted(Comparator.<Product,BigDecimal>comparing(product -> product.getPrice()).reversed())
                .map(product -> product.getName())
                .collect(Collectors.toList())
                ;

        *//*List<Product> productsMinAverage = products.stream()
                .filter(product -> product.getPrice()
                        .compareTo(priceAverage) < 0)
                .sorted(Comparator.comparing(product -> product.getPrice()))
                .collect(Collectors.toList())
                ;*//*
                //.map(product -> product.getName())

        productsMinAverage.forEach(System.out::println);*/


        String path = "C:\\Users\\Gabriel Ortiz\\Desktop\\CursoPOOJava\\src\\Section_18_ProgramacaoFuncional\\src\\EX05\\Entities\\employees.csv";

        //System.out.print("Enter full file path: ");
        //String path = sc.nextLine();
        List<Employee> employees = new ArrayList<Employee>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null){
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1],new BigDecimal(fields[2])));
            }

        } catch (IOException e){
            System.out.println("Erro ao carregar arquivo: " + e);
        }
        System.out.print("Enter salary: ");
        BigDecimal  minSalary = BigDecimal.valueOf(sc.nextInt());

        List<Employee> employeesWithSalaryAbove = employees.stream()
                                .filter(employee-> employee.getSalary().compareTo( minSalary) >0)
                                        .collect(Collectors.toList());

        /*List<String> emailsOfEmployeesWithSalaryAbove = employeesWithSalaryAbove.stream()
                .sorted(Comparator.<Employee,String>comparing(employee -> employee.getEmail())
                        .reversed())
                .map(employee -> employee.getEmail())
                        .collect(Collectors.toList());*/
        List<String> emailsOfEmployeesWithSalaryAbove = employeesWithSalaryAbove.stream()
                .map(employee -> employee.getEmail())
                        .sorted()
                .collect(Collectors.toList());

        employees.forEach(System.out::println);
        emailsOfEmployeesWithSalaryAbove.forEach(System.out::println);

        BigDecimal sumSalaryOfNameStartWithM = employees.stream()
                .filter(employee -> employee.getName().startsWith("M"))
                .map(employee -> employee.getSalary())
                        .reduce(BigDecimal.ZERO, (salary1,salary2) -> salary1.add(salary2));

        System.out.println("Sum of salary of people whose name starts with 'M': " + sumSalaryOfNameStartWithM);



    }
}
