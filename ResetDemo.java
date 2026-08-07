import java.io.ByteArrayOutputStream;

class ResetDemo
{
    public static void main(String args[])
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        out.write('A');
        out.write('B');
        out.write('C');

        System.out.println(out.toString());

        out.reset();

        out.write('X');
        out.write('Y');

        System.out.println(out.toString());
    }
}