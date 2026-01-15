package Section_8__IntroducaoPOO.src;

import Section_8__IntroducaoPOO.src.Entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class MainSection8 {
    public  static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //---76
        //EX01
        /*Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        Double width = sc.nextDouble();
        Double height = sc.nextDouble();

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        Double area = rectangle.calcArea();
        Double perimetro = rectangle.calcPerimeter();
        Double diagonal = rectangle.calcDiagonal();

        System.out.printf("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n",area, perimetro, diagonal );*/

        //EX02
        /*Employee employee = new Employee();
        System.out.print("Name:");
        String employeeName = sc.nextLine();
        System.out.print("Gross Salary:");
        Double employeeGrossSalary = sc.nextDouble();
        System.out.print("Tax:");
        Double employeeTax = sc.nextDouble();

        employee.setName(employeeName);
        employee.setGrossSalary(employeeGrossSalary);
        employee.setTax(employeeTax);



        System.out.println(employee);

        System.out.print("Which percentage to increase salary?");
        Double percentageIncreaseSalary = sc.nextDouble();
        employee.increaseSalary(percentageIncreaseSalary);

        System.out.printf("Updated data: %s, $ %.2f",employeeName, employee.netSalary());*/

        //EX03

        /*Student student = new Student();

        String studentName = sc.nextLine();
        Double studentFirstSemesterGrade = sc.nextDouble();
        Double studentSecondSemesterGrade = sc.nextDouble();
        Double studentThirdSemesterGrade = sc.nextDouble();

        student.setName(studentName);
        student.setFirstSemesterGrade(studentFirstSemesterGrade);
        student.setSecondSemesterGrade(studentSecondSemesterGrade);
        student.setThirdSemesterGrade(studentThirdSemesterGrade);


        System.out.println(student.passResult(student.calcAnnualGradesSum()));*/

        //---79
        //EX
        System.out.print("What is the dollar price?");
        Double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        Double dollarAmount = sc.nextDouble();


        CurrencyConverter.printAmountToPayInBrazilianReais(CurrencyConverter.calculateAmountToPayInBrazilianReais(dollarPrice,dollarAmount));


    }
}
