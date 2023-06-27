public class InitialExtraCredit { // class InitialExtraCredit
    public static void main(String[] args) { // main
        // Declare variables
        final int ROW = 5; // final num ROW = 5
        final int TRI = 4; // final num TRI = 4

        for(int row = 1; row <= ROW; row++) // for row = 1 to ROW step 1
        {
            //
            System.out.printf(" "); // output " "
            for(int tri = row; tri<=TRI; tri++) // for tri = row to TRI step 1
                System.out.printf(" ");
            //
            for(int col = 1; col <= row; col++) // for col = 1 to row step 1
                if(row!=ROW) // if row does not = ROW then
                {
                    if (row == 3 && col == 2) // if row == 3 && col == 2 then (removes 2 stars from middle)
                    {
                        System.out.printf("  "); // output "  "
                    }
                    else // else
                    {
                        System.out.printf("**"); // output "**"
                    }
                }
                else if (row == 5 && (col == 1 | col == TRI)) // else if (row == 5 && (col == 1 | col == TRI)) (makes the bottom legs)
                {
                    System.out.printf("**"); // output "**"
                }
                else // else
                {
                    System.out.printf("   "); // output "   "
                }
            System.out.println(" "); // output ""
        } // endfor
    } // return
} // end class
