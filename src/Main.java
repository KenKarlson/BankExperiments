//***
// Version 3.0
//*

import bankaccounts.BankAccount;
import bankaccounts.DebitAccount;

public class Main {
    public static void main(String[] args){

        DebitAccount da_1 = new DebitAccount(001, 1000.00);

        da_1.withdraw(1500);
        var x = da_1.getBalance();
        da_1.getCreationTime();
        System.out.println(x +"\n"+da_1.getCreationTime());
        da_1.withdraw(100);
        System.out.println(da_1.getBalance());
        da_1.deposit();


    }
}
