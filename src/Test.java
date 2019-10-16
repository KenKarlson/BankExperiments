import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws ParseException {
        DateFormat myFormat = new SimpleDateFormat("yyyyMMddHHmm"); // Формат даты

        // Из строки в тайм
        String myData = "201909141200"; // Входящие данные
        var incomingTime = myFormat.parse(myData);// Получить дату
        System.out.println(incomingTime);// Распечатать дату

        // Из тайм в строку
        var currentTime = myFormat.format(System.currentTimeMillis());// Текущая дата
        System.out.println(currentTime);// Текущая дата в моем формате

        System.out.println();
        // Большая разница?
        long diff = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis())-
                TimeUnit.MILLISECONDS.toDays(new SimpleDateFormat("yyyyMMddHHmm")
                        .parse(myData).getTime());
        System.out.println(diff);
        System.out.println();

        // Метод професора Хьюберта Фарнсворта
        if(isDateAfterMatch(myData)){// Если моя дата позже
            System.out.println("Yes");// Да
        }else{
            System.out.println("No");// Нет
        }
    }


    public static boolean isDateAfterMatch (String dateString){
        return LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyyMMddHHmm")).isAfter
                (LocalDateTime.of(2018, 12, 31, 23, 30));
    }
}


