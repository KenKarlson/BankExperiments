package bankaccounts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class DebitAccount extends BankAccount{
    DateFormat myFormat = new SimpleDateFormat("yyyyMMddHHmm");

    public String openingDate ;
    public DebitAccount(int accountNumber, double totalMoney) throws ParseException {
        super(accountNumber, totalMoney);
    }
    public DebitAccount(int accountNumber, double totalMoney, String openingDate) throws ParseException {
        super(accountNumber, totalMoney);
        this.openingDate = openingDate;
    }

    public String getOpeningDate() {
        return openingDate;
    }


    // Выдать запрошенную сумму
    public double withDrawMoney(double x, long diff ) {

        if (diff >= 31 && x < totalMoney && totalMoney > 0) {
            totalMoney = totalMoney - x;
            System.out.println("Выдано > " + x);
            System.out.println("Остаток на счете: " + totalMoney);
            return x;

        }
        System.out.println("Операция невозможна...");
        return 0.0;
    }
}
