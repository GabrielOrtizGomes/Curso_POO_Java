package Section_13_Heranca_Polimorfismo.src;

import Section_13_Heranca_Polimorfismo.src.Ex01.Entities.Employee;
import Section_13_Heranca_Polimorfismo.src.Ex01.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MainSection13 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of employees: ");
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
        }
    }
}
