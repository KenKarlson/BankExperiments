package bankaccounts;

import java.util.Date;

public abstract class BankAccount {

    private int accountNumber;
    private double balance;
    private Date creationTime;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        setCreationTime();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    // Внесение средств
    public void deposit(double amount) {
        balance = balance + amount;
    }
    // Снятие средств
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    // Вывод баланса
    public void display() {
        System.out.println("balance = " + this.getBalance());
    }
    // Дата открытия счета
    public void setCreationTime(){
        creationTime = new Date();
    }

    protected abstract void setBalance();
}
