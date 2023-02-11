public class OverrdingB extends OverridingA{
    int k;
    OverrdingB (int a, int b, int c){
        super(a,b);
        k=c;
    }

    void show(){
        super.show();// if not use the result will hide parent class variables. to call parent class use supper
        System.out.println( "k" + k);
    }
}
