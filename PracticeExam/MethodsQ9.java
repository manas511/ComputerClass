package PracticeExam;
import java.util.Scanner; ;
public class MethodsQ9 {
    String pizzaSize;
    int cheese  , pepperoni , mushroom;
    double c ;
    MethodsQ9(){
        pizzaSize = " ";
        cheese=0;
        pepperoni = 0;
        mushroom = 0;
         
    }
    // process2
    double CalculateCost2(String PizzaSize ,  int Cheese , int Pepperoni , int Mushroom){
        
        if (pizzaSize.equals("Small")){
            c = 500 + Cheese * 25 + Pepperoni * 25 + Mushroom *25; 
        } else if (pizzaSize.equals("Medium")){
            c = 650 +  Cheese * 25 + Pepperoni * 25 + Mushroom *25; 
        }
        else if (pizzaSize.equals("Large")){
            c = 800 +  Cheese * 25 + Pepperoni * 25 + Mushroom *25; 
        }
        System.out.println("Rs" + c);
        return c ;
    }
    //process 1
    double CalculateCost(){
        Scanner in = new Scanner (System.in);
        pizzaSize = in.nextLine();
        cheese = in.nextInt();
        pepperoni = in.nextInt();
        mushroom = in.nextInt();
        if (pizzaSize.equals("Small")){
                    c = 500 + cheese * 25 + pepperoni * 25 + mushroom *25; 
                } else if (pizzaSize.equals("Medium")){
                    c = 650 +  cheese * 25 + pepperoni * 25 + mushroom *25; 
                }
                else if (pizzaSize.equals("Large")){
                    c = 800 +  cheese * 25 + pepperoni * 25 + mushroom *25; 
                }else {
                    System.out.println("in");
                }
                System.out.println("Rs"+c);
        return c ;
        }
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        MethodsQ9 call = new MethodsQ9();
 
        System.out.println("First ");
         call.CalculateCost();
         System.out.println("Please recheck");
         String s =in.nextLine();
          int a = in.nextInt(); 
          int b = in.nextInt();
          int c =in.nextInt();
         call.CalculateCost2(s , a ,b , c );
 
    }
    
    
}
