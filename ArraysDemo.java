public class ArraysDemo {
    public static void main (String[] args) {
        //An array is a data  structure while holds a group of variables together
        //its size should b edefined.
        //when an aray is created we cannot change size of array
      /*  int month_days[]; // tpe  name_arr[]
        month_days= new int [5]; //name_arr = new tye [size]
        month_days[0] = 9; // assign the value an always array starts with 0
        month_days[1] = 10;
        month_days[2] = 20;
        month_days[3] = 30;
        month_days[4] = 40;
      //  month_days[5] = 50;
       //for (int i=0; i<=4; i++) or
        for (int i=0; i<=4; i=i+1)
        System.out.println(month_days[i]);*/
      //  System.out.println(month_days[1]);
       // System.out.println(month_days[2]);
       // System.out.println(month_days[3]);
       // System.out.println(month_days[4]);
       // System.out.println(month_days[5]);


        /* int month_days[] = {10,20, 30, 40, 50, 60, 70 };
        for (int i=0; i<month_days.length; i=i+1)
            System.out.println(month_days[i]);
        //System.out.println(month_days[i]);*/



//        int nums[] = {10,20, 30, 40, 50, 60, 70 };
//        double result = 0;
//        for (int i=0; i<nums.length; i=i+1)
//        {
//            System.out.println(result +"="+ result+ "+" + nums[i]);
//            result = result+nums[i];
//        }
//        System.out.println("Average of nums is :" + result/nums.length);
//        System.out.println("Average of nums is :" + String.format("%.2f", result/nums.length));


//        int aar[];
//        aar =new int [5];
//        for (int i=0; i<aar.length; i=i+1)
//        {
//            aar[i]= i *10;
//            System.out.println(aar[i]);
//        }


        int nums[] = {10,20, 30, 40, 50, 60, 70 };
        float result = 0;
        for (int i=0; i<nums.length; i=i+1)
        {
            System.out.println(result +"="+ result+ "+" + nums[i]);
            result = result+nums[i];
        }
        System.out.println("Average of nums is :" + result/nums.length);
        System.out.println("Average of nums is :" + String.format("%.2f", result/nums.length));
       // String str = String.format("%.02f", pi)



    }
}
