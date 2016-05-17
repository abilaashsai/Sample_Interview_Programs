import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
public ArrayList<Integer> factor(int input){
    ArrayList<Integer> arrayList=new ArrayList<>();
    for(int i=2;i<=input;i++)
    {
        int count=0;
        for(int j=1;j*j<=i;j++)
        {
            if ((i%j)==0)
            {
                count++;
                if(count>1){break;}
            }
        }
        if(count==1){
            if((input%i)==0)
            {
                arrayList.add(i);
            }

        }
    }
    return arrayList;

}
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int input;
        Main main=new Main();

        try
        {
            input = Integer.parseInt(reader.readLine());
            ArrayList<Integer> arrayList=new ArrayList<>();
            arrayList=main.factor(input);
            for (int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        }
}
