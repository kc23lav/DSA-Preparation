
public class Pattern_03
{
    public static void main(String[] args) 
    {
        int t=0;
        for(int i=1;i<=5;i++)
        {
            ++t;
            for(int j=1;j<=i;j++)
            {
                System.out.print(t +" ");
            }
            System.out.println();
        }
    }
}
