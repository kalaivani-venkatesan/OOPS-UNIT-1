import java.util.Scanner;

class NextIntDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        System.out.println("Number = " + n);
    }
}