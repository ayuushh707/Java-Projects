import java.util.*;
class masteer
{
    static Scanner sc=new Scanner(System.in);
    int n, a;

    static int mul(int n,int a)
    {
        if(n==0 && a!=0)
            return 1;
        else if(n>=0 && n<10 && a==0)
            return n;
        else 
        {
            if(n%10==0)
            {
                return mul(n/10,++a);
            }
            else
            {
                return n%10*mul(n/10,++a);
            }
        }

    }

    void display()
    {
        System.out.println("the multiplication of the digit is"+mul(n,a));
    }

    public static void main()
    {
        System.out.println("enter a number");
        int a=sc.nextInt();
        int y=0;
        int k=mul(a,y);
        System.out.println("the multiplication of the digit is" +" "+k);

    }
}
