package practiceJava;

public class IfElseStatementsFlows {
    public static void main(String[] args) {
        ifElseStatment();
        ifElseNested();


    }

    public static void ifElseStatment() {
        int age = 26;

        //if else statement

        if (age > 30) {
            System.out.println("I am an old man");
        } else if (age >= 30) {
            System.out.println("I am still alive");
        } else if (age < 25) {
            System.out.println("I am still young");
        } else {
            System.out.println("there is an error");
        }
    }
    public static void ifElseNested() {
        int a = 10;
        int b = 8;
        int c = 10 * 8;

        if (a == 10) {
            if (b < 5)
            {
                System.out.println("b is slmaller ");
            } else
            {
                System.out.println("b is bigger than variable ");
            }
        }else
        {
            System.out.println("else map to fe ");
        }
    }
}
