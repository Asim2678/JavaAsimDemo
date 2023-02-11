public class IfElseNesterd {

    public static void main (String[] args) {

        // int month = Integer.parseInt(args[0]);
        int i = 15;
        int j = 21;
        int a,b;

        if (i==10) //f1
        {
            if(j < 20)
            {
                System.out.println("inside if ie f2"); // f2
            }
            else
            {
                System.out.println("else maps to nearest if id f2");
            }

        }
        else
        {
            System.out.println("else maps to nearest if id f1");
        }
    }
}
