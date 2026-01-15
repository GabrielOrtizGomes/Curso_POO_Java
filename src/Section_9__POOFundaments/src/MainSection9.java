package Section_9__POOFundaments.src;

import Section_9__POOFundaments.src.Entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class MainSection9 {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)?");
        String booleanInitialDeposit = sc.next();
        if(booleanInitialDeposit.equalsIgnoreCase("y") ){
            System.out.print("Enter initial deposit value: ");
            Double initialDepositValue = sc.nextDouble();
             bankAccount = new BankAccount(accountNumber, accountHolder, initialDepositValue);
        } else {
             bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println("Account data:");
        System.out.println(bankAccount);

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bankAccount.deposit(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);

        System.out.println("Updated account data: ");
        System.out.println(bankAccount);


    }
}
