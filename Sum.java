import java.io.*;
public class Sum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        int b=Integer.parseInt(br.readLine());
        int s=a+b;
        System.out.print("The sum is "+s);
    }
}
