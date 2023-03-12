package practiceReturnValue;
//import org.apache.commons.lang3.RandomStringUtils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class ParentReturnFile {
    //return statement is used where we dont want to print anything and want to returen the output in return
    // void does not return the value so
    //we should use data type instead of void to return

    // in case of method call and no return value we can only get what was done in the parent method
    // this does not return any value. We cannot use this value
    //to this is a perfect example where I call my test case that is written in public void method. and I call them and
    //test runs.. no value returns

    public String pritn()
    {
        return "HI. I am here";
    }
    public String randomNumb(){
        String randNumber = RandomStringUtils.randomNumeric(10);
        return randNumber;
    }
    public int randomNumber()
    {
        Random rand = new Random();
        int random_int =rand.nextInt(1000);
        //System.out.println("Printint random at 1: "+random_int);

        return random_int;
    }
    public double randomNum(){
        Random rando = new Random();
        double random_Str = rando.nextDouble();

        return random_Str;

    }


}
