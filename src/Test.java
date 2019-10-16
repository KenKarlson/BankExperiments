import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws ParseException {
        DateFormat myFormat = new SimpleDateFormat("yyyyMMddHHmm"); // Формат даты
        // Из строки в тайм
        String myData = "201901011320"; // Входящие данные
        var incomingTime = myFormat.parse(myData);// Получить дату
        System.out.println(incomingTime);// Распечатать дату

        
        // Из тайм в строку
        var currentTime = myFormat.format(System.currentTimeMillis());// Текущая дата
        System.out.println(currentTime);// Текущая дата в моем формате


    }
}
