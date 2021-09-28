package PracticeExam;
import java.util.Scanner;
public class VinitaPractice {

    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        double cost ;
        System.out.println("Please enter the numbers of Items ");
        
    
        double  n = sc. nextDouble();
        if ( n <= 100){
            cost = n*2;
            System.out.println("cost of "+ n +" items = " + cost + "Rs");
        }
          else if (n<=250) 
          {
              cost= n*3;
              System.out.println("cost of" + n + "items = " + cost + "Rs");
          }
          else if ( n > 350)
          {
              cost= n*5;
              System.out.println("cost of" + n + "items = " + cost + "Rs");
          }
        else
        System.out.println(" invalid choice");
    }       
}

 

    

