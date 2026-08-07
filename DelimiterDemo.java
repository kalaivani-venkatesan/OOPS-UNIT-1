import java.util.Scanner;

class DelimiterDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner("Apple,Orange,Mango");

        sc.useDelimiter(",");

        while(sc.hasNext())
        {
            System.out.println(sc.next());
        }
    }
}