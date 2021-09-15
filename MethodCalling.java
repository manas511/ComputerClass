import java.util.Scanner ;
public class MethodCalling{

    public static void main (String[] args ){
        Scanner in = new Scanner (System.in);
    // int i = in.nextInt();
     for (int i = 100; i < 1000; i++) {
         if(isArmstrong(i)){
             System.out.println(i + " ");
         }
     }   
    }
   
    static boolean isArmstrong(int n ){
        int original = n ;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            n = n/10;
            sum += rem *rem *rem ;
        }
        if ( sum == original ){
            return true ;
        }
        return false ;
    }

    // static void aman (String manas ){
    //     System.out.println(manas);
        
    // }
    // static  int  manas(int a , int b ) {
    //     int c = 0;
    //     return a ;
    // }
}