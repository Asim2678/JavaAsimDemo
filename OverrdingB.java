public class OverrdingB extends OverridingA{
    int k;
    OverrdingB (int a, int b, int c){
        super(a,b);
        k=c;
    }

    void show(){
        super.show();
        System.out.println( "k" + k);
    }
}
