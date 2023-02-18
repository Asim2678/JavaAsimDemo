import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Testitrationclass {
    static int i;
    public static <string> void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        System.out.println(LocalDate.now().format(formatter));
        String Date = LocalDate.now().format(formatter);
        System.out.println(Date);

        /*int count = 0;
        String count3 = null;
        while (count <= 3) {
            System.out.println("" + count++);

            //System.out.println(Date+count);
            String count2 = Date + count;
            System.out.println("This is count 2 :" + count2);
            count3 = count2;

        }*/
        i++;
        // int addvalue1 =i;

        string count1 = (string) (Date + i);
        //String count2= Integer.toString(count1);
        System.out.println("1=" + count1);
    }
}
