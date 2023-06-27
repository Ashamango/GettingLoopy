public class GettingLoopyPartB_7 {
    public static void main(String[] args) { // main
    // Declare variables
        final int ROW = 5; // final int ROW = 5
        final int COL = 5; // final int COL = 5

        for(int row = 1; row <= ROW; row++) // for row = 1 to ROW step 1
        {
            // Inner loop goes across the row through the columns
            for(int col = 1; col <= COL; col++) // for col = 1 to COL step 1
            {
                System.out.printf("*", row * col); // output "*", row * col
            }
            System.out.println(""); // output ""
        } // endfor
    } // return
} // end class
