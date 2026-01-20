package Section_14_Tratamento_Excecoes.src;

import Section_14_Tratamento_Excecoes.src.Entities.Account;
import Section_14_Tratamento_Excecoes.src.Exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class MainSection14 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int accountNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String accountHolder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double accountInitialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double accountWithdrawLimit = sc.nextDouble();
            Account account = new Account(accountNumber, accountHolder, accountInitialBalance, accountWithdrawLimit);
            System.out.print("Enter amount for withdraw: ");

            account.withdraw(sc.nextDouble());
            System.out.printf("New balance: %.2f",account.getBalance());

        } catch (AccountException e){
            System.out.printf("Error account: %s", e.getMessage());
        } catch (RuntimeException e){
            System.out.printf("Error: %s", e.getMessage());
        }

    }
}
