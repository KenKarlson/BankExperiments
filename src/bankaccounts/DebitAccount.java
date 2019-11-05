package bankaccounts;

public class DebitAccount extends BankAccount{

    public DebitAccount(int accountNumber, double totalMoney) {

        super(accountNumber, totalMoney);
    }

    public void withdraw(double amount) {
        if(amount < balance){
            balance = balance - amount;
        }
    }
}

