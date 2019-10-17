//***
// Version 1.0
//*

import bankaccounts.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bk_1 = new BankAccount(001, 1000.00);
        System.out.println(bk_1.getTotalMoney());

        bk_1.withDrawMoney(500);

    }
}
