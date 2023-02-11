public class InheritanceC extends InheritanceA {

    int i;

    public InheritanceC (int a, int b)
    {
        super.i=a;
        i=b;
    }
    void showi(){
        System.out.println("value fo in pare" + super.i);
        System.out.println("value fo in and j " + super.i);
    }
}
