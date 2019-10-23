//***
// Version 2.0
//*

import bankaccounts.BankAccount;
public class Main {
    public static void main(String[] args){

        BankAccount bk_1 = new BankAccount(001, 0.00);
        //Внести деньги на счет
        bk_1.setTotalMoney(112.2);
        //Снять деньги со счета
        bk_1.setTotalMoney(-510.5);
        System.out.println((bk_1.getTotalMoney() < 0) ? "Вы должны банку: " + bk_1.getTotalMoney() + " руб." :
                "На счету " + bk_1.getTotalMoney() + " руб.");


    }
}
