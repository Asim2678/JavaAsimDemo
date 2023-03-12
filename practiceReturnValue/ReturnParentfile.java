package practiceReturnValue;

public class ReturnParentfile {
    public static void main(String [] args){

        ParentReturnFile P = new ParentReturnFile();
        P.pritn();
        // String message = P.pritn();
        System.out.println("Print P : "+P.pritn());

        ParentReturnFile s = new ParentReturnFile();
        s.randomNumb();
        System.out.println("Print Random 10 for s:"+ s.randomNumb());


        ParentReturnFile r = new ParentReturnFile();
        r.randomNum();
        System.out.println("Print r :" + r.randomNum());

        ParentReturnFile q = new ParentReturnFile();
        q.randomNumber();
        System.out.println("Print q :" + q.randomNumber());

        }


}



