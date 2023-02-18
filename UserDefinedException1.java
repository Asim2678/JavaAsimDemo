public class UserDefinedException1 extends Exception {

    private int detail;

    UserDefinedException1(int a) {
        detail = a;

    }


    public String toStrig() {

        return "my exception[" + detail + "]";

    }

    class ExeptionDemo {
        static void compute(int a) throws UserDefinedException1 {
            System.out.println("Called computed method" + a);

            if (a > 10)
                throw new UserDefinedException1(a);
            System.out.println("Exit from programe");
        }
        public static void main(String[] args) {
            try
            {
                compute(11);
            }

             catch (UserDefinedException1 e)
             {
               // throw new RuntimeException(e);
                 System.out.println("Exit from programe" );
            }
        }
    }
}
