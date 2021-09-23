import java.util.Scanner;
public class MenuDriver {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double no ;
        System.out.println("Conversion Table");
        System.out.println("============");
        System.out.println("1. Miliseconds to Seconds ");
        System.out.println("2.Miliseconds to Minutes ");
        System.out.println("3.Seconds to Miliseconds ");
        System.out.println("4.Seconds to Minutes ");
        System.out.println("5.Minutes to Miliseconds ");
        System.out.println("6.Minutes to Seconds ");
        System.out.println("Please enter your choice ");
        int ch = sc .nextInt();
        System.out.println("Please enter a value " );
        double n = sc.nextDouble();
        switch (ch ){

            case 1 :
            no =  (n/1000);
            System.out.println("The value of " + n + "miliseconds is " +no +" seconds");
            break;
            case 2 :
             no = (n/60000);
             System.out.println("The value of " + n + "milliseconds  is " +no +" minutes ");
             break;
             case 3 :
             no = n*1000;
             System.out.println("The value of " + n + "seconds  is " +no +" miliseconds  ");
             break;
             case 4 :
             no = n/60;
             System.out.println("The value of " + n + "seconds  is " +no +" minutes   ");
             break;
             case 5 :
             no = n * 60000 ;
             System.out.println("The value of " + n + "Minutes   is " +no +" miliseconds    ");
             break;
             case 6 :
             no = n*60;
             System.out.println("The value of " + n + "minutes is  " +no +" Seconds    ");
            break;
              
            default:
            System.out.println("Invalid Choice ");
        }
    }
    
}
// 1 s = 1000 Miliseconds