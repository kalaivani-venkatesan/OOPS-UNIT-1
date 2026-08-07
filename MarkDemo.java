import java.io.ByteArrayInputStream;

class MarkDemo
{
    public static void main(String args[])
    {
        String s = "Java";

        ByteArrayInputStream in = new ByteArrayInputStream(s.getBytes());

        System.out.print((char)in.read());

        in.mark(10);

        System.out.print((char)in.read());

        in.reset();

        System.out.print((char)in.read());
    }
}