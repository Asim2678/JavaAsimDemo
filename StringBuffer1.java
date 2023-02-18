public class StringBuffer1 {

    public static void main(String[] args) {

        StringBuffer str =new StringBuffer("Welcome to");
        str.append(" Java");
        System.out.println(str);


        str.insert(2, " Selenium ");
        System.out.println(str);


    }
}
