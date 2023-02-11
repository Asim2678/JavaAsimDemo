public class OverloadingTest {

    public static void main(String[] args) {
        OverloadingDemo overLad = new OverloadingDemo();
        overLad.hello();
        overLad.hello(20);
        overLad.hello(20, 30);
    }
}
