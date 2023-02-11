public class MultidymentionalArray {

    public static void main (String[] args) {
        // multi dimentional array means array of arrays
        int twoDaar [] [];
        twoDaar = new int [4] [5];
        int k=0;
        for (int i=0; i<4; i++)
        {
            for (int j=0;j<5;j++)
            {
            twoDaar[i][j] = k;
            System.out.println(" value of towDarr is   ["+i+"] ["+j+"] is : " +twoDaar[i][j]);
            k++;
            }
            System.out.println("******");
        }
    }
}
