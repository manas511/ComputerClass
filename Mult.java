import java.util.*;
public class Mult{
    public static void main(String [] args ){
        Scanner in = new Scanner (System.in);
        int a [][] = new int[4][4];
        int b [][] = new int [4][4];
        // int c [][] = new int [4][4];
        System.out.println("Enter the number in matrix of 4*4 : ");
 for (int i = 0; i < b.length; i++) {
     for (int j = 0; j < b.length; j++) {
         a[i][j] = in.nextInt(); 
        //  b[i][j] = in.nextInt();
     }
 }
 for (int i = 0; i < b.length; i++) {
    for (int j = 0; j < b.length; j++) {
    System.out.println(a[i][j] + " "); 
       //  b[i][j] = in.nextInt();
    }
    System.out.println(" ");
}
for (int i = 0; i < b.length; i++) {
    for (int j = 0; j < b.length; j++) {
                        System.out.println(); 
                        System.out.println(); 
                        System.out.println(); 
                        System.out.println(); 
            }
        }
    }    
}