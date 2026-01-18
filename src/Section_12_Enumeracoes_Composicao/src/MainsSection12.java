package Section_12_Enumeracoes_Composicao.src;

import Section_12_Enumeracoes_Composicao.src.Entities.Departament;
import Section_12_Enumeracoes_Composicao.src.Entities.Enum.WorkerLevel;
import Section_12_Enumeracoes_Composicao.src.Entities.HourContract;
import Section_12_Enumeracoes_Composicao.src.Entities.Worker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainsSection12 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //EX RESOLVIDO 01

        System.out.print("Enter department´s name: ");
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
        System.out.printf("Income for %s: %.2f", monthCalcIncome, workerIncome);

    }
}
