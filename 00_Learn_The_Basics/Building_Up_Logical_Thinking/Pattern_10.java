
public class Pattern_10
{
    public static void main(String[] args) 
    {
        int s;
        for(int i=1;i<=5;i++)
        {
            if(i%2==0)
                s=0;
            else
                s=1;
            for(int j=i;j>=1;j--)
            {
                System.out.print(s + "  ");
                s=1-s;
            }
            System.out.println();
        }
    }
}
