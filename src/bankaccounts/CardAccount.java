package bankaccounts;

public class CardAccount extends BankAccount {
    public CardAccount(int accountNumber, double totalMoney) {
        super(accountNumber, totalMoney);
    }

    public void withdraw(double amount) {
        if (amount < this.getBalance() && this.getBalance() > 0){
            if((amount+(amount/100)< this.getBalance())){
                var x = this.getBalance();
                var y = amount+(amount/100);

                this.setBalance(x-y);
            }
        }
    }

    @Override
    protected void setBalance() {

    }
}
