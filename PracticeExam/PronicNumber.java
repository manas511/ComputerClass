package PracticeExam;
import java.util.Scanner;
public class PronicNumber {
    
    public static void main (String[] args ){
        Scanner in = new Scanner (System.in);
        int n ;
        // pronic();
        System.out.println("checking the v2 of pronic ");
        int ans ;
         if (ans >0){
             
         } 
          proModify(n = in.nextInt());
         System.out.println(ans);

        // Proni(n);
    }
    // static boolean  Proni(int a ){
    //     for (int i = 0;i <= a ; i++){
    //         if (a == i * (i + 1))
    //        System.out.println("True");
    //        return true;
    //     }
    //     System.out.println("False");
       
       
    //     return false;
    // }
static void pronic(){
    Scanner in = new Scanner (System.in);
    int a = in.nextInt();
    for (int i = 0;i <= a ; i++){
                if (a == i * (i + 1))
               System.out.println("True");
    }          
            
            // System.out.println("False");
    
           
      
}
static boolean  proModify(int a ){
    for (int i = 0;i <= a ; i++){
        if (a == i * (i + 1))
    //    System.out.println("True");

        return true ;   
 }          
return false;
}
    
}
