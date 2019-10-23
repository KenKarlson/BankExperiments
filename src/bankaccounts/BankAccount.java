package bankaccounts;

import java.util.Date;

public class BankAccount {

    private int accountNumber;
    private double totalMoney;
    private Date creationTime;

    public BankAccount(int accountNumber, double totalMoney) {
        this.accountNumber = accountNumber;
        this.totalMoney = totalMoney;
    }

    private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney += totalMoney;
    }
}
