public class InterfaceDemo implements Callback{
   public void method01(){
       System.out.println("Implementation of Method 01");

   }
    public static void main(String[] args) {
       InterfaceDemo object3 =  new InterfaceDemo();
       object3.method01();

    }
}
