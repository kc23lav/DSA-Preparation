
public class Pattern_17
{
    public static void main(String[] args) 
    {
       char t='E';
        for(int i=0;i<=4;i++)
        { 
            char temp=t;
            for(int j=i;j>=0;j--)
            {
                System.out.print(temp);
                temp++;
            }
            t--;
            System.out.println();
        }
    }
}
