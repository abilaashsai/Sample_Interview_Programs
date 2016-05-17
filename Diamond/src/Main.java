import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number n");
        System.out.println();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int input;
        try
        {
            input = Integer.parseInt(reader.readLine());
            for (int i = 1; i <= input; i++) {
                for(int j=1;j<=input-i;j++)
                {
                    System.out.print(" ");
                }
               for(int j=1;j<=2*((input)-(input-i))-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
        catch (IOException e)
        {
            System.out.println(e);

        }
    }
}
