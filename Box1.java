public class Box1 {
        //use class keyword to declare a class
    double width; // what ever variable we create in a class these are instance variables
    double hight;// instance variable// data and instance variable are same
    double depth;// instance variable
    // variables represent data, data is nothing but a state

    // does not have a behaviour
    // the purpose of these variables is to identify the object

    // method is displaying the volume of box
    //State-- identify the object-- data depth, height and width is a data
    //behaviour-- actions which we perform on data, that we perform on an object is called behaviour-- these are nothing but methods
    // data and methods = data
    //what is class = it is user defined data type// it is used to create objects
    // it is nothing but a template for an objects
    //Static variable belongs to a class, it is not bound to an object
    void  volume1 (){//Method (displaying volume of box)
        System.out.println("Volume is : " );
        System.out.println(width*hight*depth);
    }
    //there are two classes in this class. Class box1 defines the structure(what this object should contain)
    // in another class BoxDemo I am creating an object of this class
    // Then instanting this object and calling 'Double volume;'
    // called this object by 'b1.volume();'
    //an object cannot be created inside a class
    //We access to data with help of methods

}
    class BoxDemo{
        public static void main(String[] args) {
            // syntax of a class is class name objectname = new class name();
            //Box bi;
            //b1 = new Box1();
            // I created an object that belongs to class Box1 'b1'
            // called instance variable using that object
            // how to call instance variables 'b1.width = 10;'

            Box1 b1 = new Box1();
            // object is nothing but an instance of a class
            //creating an object is a two step process.
            // 1.first create a variable ie b1 (class type) that belongs to the object.
            // 2. we physicaly assign memory to the this object using 'new' operator
           // double volume;
            b1.width = 10;
            b1.hight = 20;
            b1.depth = 15;
            // using dot operation ic an acess instance variable and methods
            //object.instancesvariables (to access instance variable)

            // calling the method
            b1.volume1();
            //volume = b1.width*b1.depth*b1.hight;
           // System.out.println("Volme of bos b1 is " + volume);

            Box1 b2;
            b2=new Box1();
            b2.width = 15;
            b2.hight = 5;
            b2.depth = 16;

            b2.volume1();
           // volume=b2.width*b2.hight* b2.depth;
            //System.out.println("Volme of bos b1 is " + volume);
            //each time create an object it should contain own copy of variables
            // each time we create an object (instance of a class)
            // we are creating an object that contains own copy of instance variables
            //the object is created on the heap and reference is on stack
            //local variable are created as static and then they become class variables
            // static variable is a class lever variable-- is a class lever variable  do

            Box1 b3;
            b3= b2; //both b2 and b3 refer to same object
            // assgnment of b2 to b3 will not allocate any memory or copay its data.
            //now b3
            b2 = null;// value of b2 is st as null so volume will be printed as 00
            b3 = new Box1();
            b3.volume1();


    }





}
