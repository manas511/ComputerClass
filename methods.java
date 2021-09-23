import java.util.Scanner;
// import java.util.jar.Attributes.Name;
class Methods {
      String taxino;
       String name ;
     int d ;
     int     fare;
    Methods(){
          taxino = "";
         name = "";
         d = 0;
         int     fare = 0;
    }
        void Input(){
        Scanner in = new Scanner(System.in);
        taxino  = in.nextLine();
        name    = in.nextLine();   
        d       = in.nextInt();    
        
    }

     void calculate(){
   
    if(d>=1){
        System.out.println("your fare is 25 rupees per km  ");
        fare = d*25;
    }
    else if(d<=5){  
        System.out.println("your fare is 30 rupees per km  ");
        fare = d*30;
    }
    else if(d<=10){
                System.out.println("your fare is 35 rupees per km  ");
        fare = d*35;
    }
    else if(d  <= 20){
        System.out.println("your fare is 40 rupees per km  ");
        fare = d*40;
    }
    else if(d< 20){
        System.out.println("your fare is 45 rupees per km  ");
        fare = d*45;
    }
    
        
    }
    void Display(){
        System.out.println("TaxiNo          Name            Distance(km)            BillAmount");
        System.out.println(taxino + "           " + name + "              "+d+   "            "+ fare);
    }
    public static void main (String [] args){
        // Scanner in = new Scanner(System.in);
        Methods aman = new Methods();
        aman.Input();
        aman.calculate();
        aman.Display();
     
         
        }
}

