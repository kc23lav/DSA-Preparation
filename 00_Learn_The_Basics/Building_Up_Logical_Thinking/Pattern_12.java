
public class Pattern_12
{
    public static void main(String[] args) 
    {
        int t=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(t+ " ");
                ++t;
            }
            System.out.println();
        }
    }
}
