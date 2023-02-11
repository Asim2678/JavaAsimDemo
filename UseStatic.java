public class UseStatic {

    // some times it is required to define a calss member independent of a object
    //both methods and variabl can be satic
    static int a = 2;
    static int b;


    public static void main(String[] args) {

        method01(5);
    }
    static void method01 (int x)
    {
        System.out.println( "value of x " +x);
        System.out.println( "value of a " +a);
        System.out.println( "value of b " +b);
    }

    //Static key word is used for memory management
    //statid memeber of class belongs to class it self insted of class objects
    //contructor cannot be static
    //static method can be inovked without creating an object
    //statud method can access statid data members (static variables)
    //and change its values
    static  {// static block// statuic variable can be accessed and assigned a value in static block
            b=a*2;
    }
}
