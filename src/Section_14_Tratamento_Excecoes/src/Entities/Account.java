package Section_14_Tratamento_Excecoes.src.Entities;

import Section_14_Tratamento_Excecoes.src.Exceptions.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }


    public void deposit(Double amount){
        balance += amount;
    }
    public void withdraw(Double amount) throws AccountException{
        if (amount > withdrawLimit){
            throw new AccountException(String.format("The withdrawal amount exceeds the limit of %.2f.",withdrawLimit) );
        }
        if (balance <0){
            throw new AccountException("Withdrawal cannot be performed when the balance is zero or negative.");
        }
        balance -= amount;
    }

    public Double getBalance() {
        return balance;
    }
}
