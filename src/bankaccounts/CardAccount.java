package bankaccounts;

public class CardAccount extends BankAccount {

    public double bankInterest;
    public CardAccount(int accountNumber, double totalMoney) {
        super(accountNumber, totalMoney);
    }

    // Показать номер счета
    public int getAccountNumber() {

        return accountNumber + 10000 ;
    }

    public double withDrawMoney(double x){
        if (x < totalMoney && totalMoney > 0) {
            if((x+(x/100)< totalMoney)) {
                totalMoney = totalMoney - (x + (x / 100));
                bankInterest = x / 100;
                System.out.println("Выдано > " + x);
                System.out.println("Остаток на счете: " + totalMoney);
                return x;
            }
        }
        System.out.println("Недостаточно средств...");
        return 0.0;
    }
}
