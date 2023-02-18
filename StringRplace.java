public class StringRplace {
    public static void main(String[] args) {
        String org = "selenium is used for UI testing";
        String search = "UI";
        String relplace = "API";
        String result;
        result =org;
        int i;
        System.out.println("orgiional string " + org);
        System.out.println("length of search lenght " + search);


        do
        {

            i = org.indexOf(search);
            System.out.println("value of i " + i);
            if (i!=-1)
            {
                result=org.substring(0,i);
                result=result+relplace;
                result=result+org.substring((i+search.length()));
                org=result;
               // System.out.println(result);

            }
        }while (i!=-1);
        System.out.println("replaced string : " + org);
    }
}
