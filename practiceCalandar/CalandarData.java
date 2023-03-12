package practiceCalandar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CalandarData {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        System.out.println(LocalDate.now().format(formatter));
        String Date = LocalDate.now().format(formatter);
        System.out.println(Date);
    }
}
