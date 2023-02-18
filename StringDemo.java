public class StringDemo {

    public static void main(String[] args) {
        //String is nothing but array of character
        //eclosed in double quotesor sing couotes
        //strings are objects
        //string are immuteable
        char [] c={'j','a', 'v','a'};
        String sl =new String(c);
        String s2= new String(sl);
        String s3= "Java";

        System.out.println(c);
        System.out.println(sl);
        System.out.println(s2);
        System.out.println("Length of String "+s2.length());//count of characters in a string
        System.out.println(s2.charAt(1));
        System.out.println(sl.equals(s2));
        System.out.println(sl.equals(s3));
        System.out.println(sl.equalsIgnoreCase(s3));
    }
}
