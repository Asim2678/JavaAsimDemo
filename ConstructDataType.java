public class ConstructDataType {
    String name;
    int age;
    double weight;

    ConstructDataType (String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    void walk()
    {
        System.out.println(this.name);
    }

}
class DemoConstructDataType{
    public static void main(String[] args){
        ConstructDataType human = new ConstructDataType("Asim",45, 93);
       // String walk;
        human.walk();

    }
}
