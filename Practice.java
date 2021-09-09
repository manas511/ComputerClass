import java.util.Scanner;

class Practice{
     public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
         int a [][] = new int [4][4] ;
         int c ; c = 0;
         System.out.println("Enter values in 2D array"); // Entering the values in 4 * 4 grid
         for (int i = 0; i < 4 ; i++) {
             
             for (int j = 0; j < 4; j++) 
                 a[i][j] = in.nextInt(); // accepting the values

            
         }
         
         System.out.println("matrix 4X4"); // Processing the value 
         for (int i = 0; i < 4 ; i++) {
             
             for (int j = 0; j < 4; j++) 
             System.out.print(a[i][j] + "  ");
             System.out.println("  ");
            }

            for (int i = 0; i < 4 ; i++) { /// Sum of the columns 
               
               for (int j = 0; j < 4; j++) 
               c += a [j][i] ;
               System.out.println("count = "  + (i+1) + "=" + c );   
               c = 0;
               // a[i][j] = in.nextInt();
               
               
           }
        
            System.out.println("Matrix address");// Matrix Adress display
            for (int i = 0; i < 4 ; i++) {
        
                for (int j = 0; j < 4; j++) 
            System.out.print(i + "" + j + " " );
            System.out.println("  ");
           
        }
    }
}