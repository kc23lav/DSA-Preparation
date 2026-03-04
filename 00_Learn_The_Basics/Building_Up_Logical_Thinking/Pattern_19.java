public class Pattern_19
{

    public static void main(String args[])
    {
        int n=5,s=2*n-2;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");

            for(int j=1;j<=s;j++)
                System.out.print(" ");

            for(int j=1;j<=i;j++)
                System.out.print("*");

            s=s-2;
            System.out.println();
        }

        s=0;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
                System.out.print("*");

            for(int j=1;j<=s;j++)
                System.out.print(" ");

            for(int j=1;j<=n-i+1;j++)
                System.out.print("*");

            s=s+2;
            System.out.println();
        }
    }
    
}
