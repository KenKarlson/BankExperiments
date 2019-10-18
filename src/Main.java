//***
// Version 1.0
//*

import bankaccounts.BankAccount;
import bankaccounts.CardAccount;
import bankaccounts.DebitAccount;
import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ParseException {

        BankAccount bk_1 = new BankAccount(001, 1000.00);
        System.out.println("Сколько средств на основном счете?");
        System.out.println("На счете "+bk_1.getTotalMoney()+" руб.");
        System.out.println("Выдача наличных");
        bk_1.withDrawMoney(420);

        System.out.println("* * * * * * * *");
        DebitAccount dk_1 = new DebitAccount(002, 5000, "201908181200");
        System.out.println("Сколько средств на дебетовом счете?");
        System.out.println("На счете "+dk_1.getTotalMoney()+" руб.");
        long diff = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis())-
                TimeUnit.MILLISECONDS.toDays(new SimpleDateFormat("yyyyMMddHHmm")
                        .parse(dk_1.openingDate).getTime());
        System.out.println("Выдача наличных");
        dk_1.withDrawMoney(500, diff);
        System.out.println("* * * * * * * *");
        DebitAccount dk_2 = new DebitAccount(003, 5000, "201910171200");
        System.out.println("Снятие наличный со счете открытого менее месяца назад...");
        long diff_2 = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis())-
                TimeUnit.MILLISECONDS.toDays(new SimpleDateFormat("yyyyMMddHHmm")
                        .parse(dk_2.openingDate).getTime());
        dk_2.withDrawMoney(500, diff_2);

        System.out.println("* * * * * * * *");

        CardAccount ck_1 = new CardAccount(004,1000);
        System.out.print("Номер карточного счета > ");
        System.out.println(ck_1.getAccountNumber());
        System.out.println("Сколько средств на карточном счете?");
        System.out.println("На счете "+ck_1.getTotalMoney()+" руб.");
        ck_1.withDrawMoney(100);



    }
}
