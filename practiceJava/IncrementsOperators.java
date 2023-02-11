package practiceJava;

public class IncrementsOperators {


    public static void main(String[] args)
    {
        increments();
        concatinations();
        rational_operator();
        logical_operator();

    }
    public static void increments(){
        int a =5;
        System.out.println(++a);
        //pre decrement
        System.out.println(--a);
        //post increment
        int b= 9;
        System.out.println(b++);
        int c=b;
        System.out.println(c);

    }
    public static void concatinations() {
        System.out.println(5 + 6);
        System.out.println("10" + "12");
    }
    public static void rational_operator() {
        int a =10;
        int b =15;
        //<> <= >=
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
    }
    public static void logical_operator() {

        //&& ||
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
    }



}
