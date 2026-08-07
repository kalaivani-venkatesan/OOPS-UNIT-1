import java.util.Scanner;

class HasNextIntDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any value: ");

        if(sc.hasNextInt())
        {
            System.out.println("It is an Integer");
        }
        else
        {
            System.out.println("It is not an Integer");
        }
    }
}