import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
            System.out.println("Enter number n");
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            int input;
            try
            {
                input = Integer.parseInt(reader.readLine());
                for (int i = 0; i < input; i++) {
                    System.out.println("*");
                }
            }
            catch (IOException e)
            {
                System.out.println(e);

            }

    }
}
