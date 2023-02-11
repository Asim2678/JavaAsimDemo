public class SwitchDemo {

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        String season = "";
        switch (month) {
            case 1:
            case 2:
                season = "winter";


                break;
            case 3:
            case 4:
                season = "Summer";


                break;
            case 5:
            case 7:
            case 8:
                season = "Sprint";


                break;
            case 9:
            case 10:
            case 11:
                season = "Autum";

                break;
            default:
                System.out.println("invalid month");


        }
        System.out.println("month is " + season);
    }
}
