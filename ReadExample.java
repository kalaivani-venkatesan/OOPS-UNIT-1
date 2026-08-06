import java.io.ByteArrayInputStream;
class ReadExample
{
    public static void main(String args[])
    {
        String str = "Hello Java";
        ByteArrayInputStream input = new ByteArrayInputStream(str.getBytes());
        int ch;
        while((ch = input.read()) != -1)
        {
            System.out.print((char)ch);
        }
    }
}