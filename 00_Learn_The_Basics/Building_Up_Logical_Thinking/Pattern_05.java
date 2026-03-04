
public class Pattern_05
{
    public static void main(String[] args) 
    { 
        int t;
        for(int i=1;i<=5;i++)
        {
            t=0;
            for(int j=5;j>=i;j--)
            {
                System.out.print((++t) + " ");
            }
            System.out.println();
        }
    }
}
