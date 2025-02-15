public class pattern{

    public static void main(String[] args) {
        int n = 4; // Size of one side of the diamond (adjust as needed)

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Spaces before the first #'s
             for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }

            // #'s on the left side
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n-1; j++) {
                System.out.print(" ");
            }


            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {  // Corrected middle spaces
                System.out.print(" ");
            }

            // #'s on the right side
            for (int j = 1; j <= i; j++) {
                System.out.print ("#");
            }

            System.out.println();
        }

        // Lower half of the diamond (excluding the middle row)
        for (int i = 1; i <= n; i++) {
          
            // Spaces before the first #'s
            for (int j = i; j <= n-1; j++) {
               System.out.print(" ");
            }

            // #'s on the left side
            for (int j = i; j <= i; j++) {
               System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("#");
            }

            // Spaces in the middle
            for (int j = 4; j <n*i; j++) {  // Corrected middle spaces
                System.out.print(" ");
            }
           

             //#'s on the right side
            for (int j = i; j <= n; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}