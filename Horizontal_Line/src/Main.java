import com.sun.javafx.css.ParsedValueImpl;
import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

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
            for (int i = 0; i < 8; i++) {
                System.out.print("*");
            }
        }
        catch (IOException e)
        {
            System.out.println(e);

        }
        }
}
