package practiceJava;

public class ForLoop {
    public static void main (String[] args) {
        Forloop1();
        Forloop2();

    }

    public static void Forloop1() {
        int a;
        for(a = 20; a>10; a--){

            System.out.println("this is for loop:  " + a);
        }
        System.out.println("loop ended");
    }
    public static void Forloop2() {

        int C;
        int D;
        for(C=4, D=1;C>1;C++){ //infit loop
            System.out.println("this is for loop:  " + C);
            System.out.println("this is for loop:  " + D);
        }
    }

}
