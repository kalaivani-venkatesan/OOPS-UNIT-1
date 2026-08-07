import java.io.ByteArrayOutputStream;

class ToStringDemo
{
    public static void main(String args[])
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        out.write('H');
        out.write('E');
        out.write('L');
        out.write('L');
        out.write('O');

        System.out.println(out.toString());
    }
}