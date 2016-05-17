import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number n");
        System.out.println();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input;
        try {
            input = Integer.parseInt(reader.readLine());
            for (int i = 1; i <= 2*input-1; i++) {
                if (i == input) {
                    System.out.print("Abilash");
                } else {

                    for (int j = 1; j <= input - Math.abs((input) - Math.abs(input - i)); j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * Math.abs(Math.abs(input - i) - (input))) - 1; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
