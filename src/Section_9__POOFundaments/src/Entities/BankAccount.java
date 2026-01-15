package Section_9__POOFundaments.src.Entities;

public class BankAccount {
    private int number;
    private  String holderName;
    private Double balance;

    public BankAccount(int number, String holderName, Double initialBalance){
        this.number = number;
        this.holderName = holderName;
        this.balance = initialBalance;
    }
    public BankAccount(int number, String holderName){
        this.number = number;
        this.holderName = holderName;
        this.balance = 0.00;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount + 5;
    }

    public int getNumber() {
        return number;
    }

    public String getHolderName() {
        return holderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    @Override
    public String toString() {
        return String.format("Account %d, Holder: %s, Balance %.2f", number, holderName, balance);
    }
}
