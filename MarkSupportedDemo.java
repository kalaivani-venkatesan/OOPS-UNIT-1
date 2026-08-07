import java.io.ByteArrayInputStream;

class MarkSupportedDemo
{
    public static void main(String args[])
    {
        String s = "Java";

        ByteArrayInputStream in = new ByteArrayInputStream(s.getBytes());

        System.out.println(in.markSupported());
    }
}