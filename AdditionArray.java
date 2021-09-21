import java.util.Scanner;
public class AdditionArray {
    public static void main (String[] args){
    Scanner in = new Scanner (System.in);
     int a [][] = new int [3][3];
     int b [][] = new int [3][3];
     int c [][] = new int [3][3];
// Inputs 
        System.out.println("your input will be given automatically ");
                for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j < c.length; j++) {
                        a [i][j] = (int)Math.floor ( Math.random() * 10 );   
                        b [i][j] = (int)Math.floor ( Math.random() * 10 );   
                        }
                    }
                    System.out.println("The a matrix");
                  for (int i = 0; i < c.length; i++) {
                      for (int j = 0; j < c.length; j++) {
                        //   System.out.print("A : " + a[i][j] + " ");
                        //   System.out.println("B :"  + b[i][j] + " ");
                        System.out.print(a[i][j] + " " );
                    }                                                                                                                 
                        System.out.println("  ");
                                                                                      
                  }
                  System.out.println("The b matrix");
                  for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j < c.length; j++) {
                      //   System.out.print("A : " + a[i][j] + " ");
                      //   System.out.println("B :"  + b[i][j] + " ");
                      System.out.print(b[i][j] + " " );
                  }                                                                                                                 
                      System.out.println("  ");
                                                                                    
                }
                    
                for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j < c.length; j++) {
                        // a [i][j] = (int)Math.floor ( Math.random() * 10 );   
                        // b [i][j] = (int)Math.floor ( Math.random() * 10 );   
                        c [i][j] = a[i][j] + b [i][j];


                    }
            }
            System.out.println("The addition of the following is below ");
                for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j < c.length; j++) {
                    System.out.print(c[i][j] + " ");
                    }
                    System.out.println();
        }
        
    }    
}
