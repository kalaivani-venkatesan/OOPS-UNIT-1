import java.io.ByteArrayOutputStream;

class WriteDemo
{
    public static void main(String args[])
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        out.write('J');
        out.write('A');
        out.write('V');
        out.write('A');

        System.out.println(out.toString());
    }
}