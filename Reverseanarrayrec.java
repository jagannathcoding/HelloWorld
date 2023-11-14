import java.io.*;
public class Reverseanarrayrec
{
    static void rev(int i)
    {
        if(i<1)
            return;

        System.out.print(i+",");
        rev(i-1);
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        int n = Integer.parseInt(br.readLine());
        rev(n);
    }

}
