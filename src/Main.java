//***
// Version 3.0
//*

import bankaccounts.CardAccount;
import bankaccounts.DebitAccount;

public class Main {
    public static void main(String[] args){

        DebitAccount da_1 = new DebitAccount(1, 1000);
        System.out.println("Insert 500 coins");
        da_1.deposit(500);
        System.out.println("Show balance");
        da_1.display();
        System.out.println("Withdraw 1200 coins");
        da_1.withdraw(1200);


        CardAccount ca_1 = new CardAccount(2, 1000);
        System.out.println("Withdraw 100 coins");
        System.out.println("Attention, will be deducted 1% ");
        ca_1.withdraw(100);
        ca_1.display();

    }
}
