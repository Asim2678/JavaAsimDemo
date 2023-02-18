public class ThrowsDemo {
    static void throwone() throws IllegalAccessException
    {
        System.out.println("throw method one ");
        throw new IllegalAccessException();
    }
    //if a method is capable of causing exception, but it does not handle it
    //so the called of the method shojuld handle the exception using catch box
    public static void main(String[] args) {
        try
        {
            throwone();
        }
        catch (IllegalAccessException e){
            System.out.println("illegal expectoin " +e);
        }
        finally {
            System.out.println("End of try catch block " );
        }
    }
}
