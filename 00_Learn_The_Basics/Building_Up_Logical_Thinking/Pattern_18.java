public class Pattern_18
{
    public static void main(String args[])
    {
        int s = 0, n = 5;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i+1; j++)
                System.out.print("* ");

            for(int j = 1; j <= s; j++)
                System.out.print("  ");

            for(int j = 1; j <= n-i+1; j++)
                System.out.print("* ");

            s = s + 2;
            System.out.println();
        }

        s = 2*n-2;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
                System.out.print("* ");

            for(int j = 1; j <= s; j++)
                System.out.print("  ");

            for(int j = 1; j <= i; j++)
                System.out.print("* ");

            s = s - 2;
            System.out.println();
        }
    }
}
