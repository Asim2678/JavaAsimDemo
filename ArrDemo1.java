public class ArrDemo1 {


        public static void main(String[] args) {
            // TODO Auto-generated method stub


            int nums[]= {5,10,15,23,28};
            float result=0.0f;
            for(int i=0;i <nums.length;i++) {
                result=result+nums[i];
                System.out.println("The sum of resultof numbers:"+result);
                //System.out.println("The average f result:"+ String.format("%.2f",result/(nums.length)));
            }
            String str = String.format("%.02f", result/nums.length);
            System.out.println("Average of nums is :" + str);

            //System.out.println("Average of nums is :" +  result/nums.length);


        }

}
