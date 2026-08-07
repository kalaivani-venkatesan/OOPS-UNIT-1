import java.io.ByteArrayOutputStream;

class SizeDemo
{
    public static void main(String args[])
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        out.write('A');
        out.write('B');
        out.write('C');

        System.out.println("Size = " + out.size());
    }
}