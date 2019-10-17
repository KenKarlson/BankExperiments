package bankaccounts;

public class BankAccount {

    public int accountNumber;
    public double totalMoney;

    public BankAccount(int accountNumber, double totalMoney) {
        this.accountNumber = accountNumber;
        this.totalMoney = totalMoney;
    }

    // Показать номер счета
    public int getAccountNumber() {
        return accountNumber;
    }

    // Изменить номер счета
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Показать количество денег на счете
    public double getTotalMoney() {
        return totalMoney;
    }

    // Положить деньги на счет
    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    // Выдать запрошенную сумму
    public double withDrawMoney(double x) {
        if (x < totalMoney && totalMoney > 0) {
            totalMoney = totalMoney - x;
            System.out.println("Выдано > " + x);
            System.out.println("Остаток на счете: " + totalMoney);
            return x;

        }
        System.out.println("Недостаточно средств...");
        return 0.0;
    }
}
