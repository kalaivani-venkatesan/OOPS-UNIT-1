import java.io.ByteArrayInputStream;
class AvailableDemo
{
    public static void main(String args[])
    {
        String s = "Java";
        ByteArrayInputStream in = new ByteArrayInputStream(s.getBytes());
        System.out.println("Available Bytes = " + in.available());
    }
}
