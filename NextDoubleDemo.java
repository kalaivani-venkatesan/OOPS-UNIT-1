import java.util.Scanner;

class NextDoubleDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");

        double salary = sc.nextDouble();

        System.out.println("Salary = " + salary);
    }
}
