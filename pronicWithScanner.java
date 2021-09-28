import java.util.Scanner;
class pronicWithScanner
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        int n,k; k=0;
        System.out.println("Enter number :");
        n = in.nextInt();
        for(int i = 1;i<=n;i++)
        {
            if(n==i*(i+1))
            {
                k=1;
            }
        }
        if(k==1)
        System.out.println("Number is pronic");
        else
        System.out.println("Number is not pronic");
    }
}