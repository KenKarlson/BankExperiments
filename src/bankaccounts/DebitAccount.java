package bankaccounts;

import java.util.Date;

public class DebitAccount extends BankAccount{

    public DebitAccount(int accountNumber, double totalMoney) {

        super(accountNumber, totalMoney);
    }

    //Снять
    public void withdraw(double amount) {
        Date date = new Date();
        var x = getCreationTime().getTime();
        var y = date.getTime();
        if(amount < getBalance() && ( (y-x) > 2_000_000)){
            setBalance(getBalance()-amount);
        }else{
            System.out.println("Operation not possible");
        }
    }

    @Override
    protected void setBalance() {

    }
}

