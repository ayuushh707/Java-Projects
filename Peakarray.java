 import java.util.*;
class peak
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        int a=(n/2);
        int b=0;
        int d=0;
        if(n%2!=0)
        {
            System.out.println("enter the array");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int k=n-1;
            for(int i=0;i<n;i++)
            {
                d=(arr[a]>=arr[i])?++b:--b;
                if(arr[i]==arr[k])
                {
                    if(i==k)
                    {
                        c=c+1;
                    }
                    k--;
                }
                else
                {
                    System.out.println("not a mirror");
                    System.exit(0);
                }
            }
            if(c==1 )
            {
                System.out.print(" Its an Mirror array");
            }
            else
            {
                System.out.println("Not a mirror element");
            }
            if( c==1 && d==n)
            {
                System.out.println(" "+"and peak array");
                System.out.println("the peak element is"+" "+arr[a]);
            }
            else
            {
                System.out.println("not a mirror and peak array");
            }
        }
        else
        {
            System.out.println("Size of the array odd not met");  
        }

    }
}
