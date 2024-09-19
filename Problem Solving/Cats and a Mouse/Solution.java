import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        
        int tempA=0,tempB=0;

        tempA=z-x;//tmep value for A 
        tempB=z-y;// temp value for B

        if(tempA<0)
        {
            tempA=tempA*(-1);//update A temp value
        }
        if(tempB<0)
        {
            tempB=tempB*(-1);//update B temp value
        }
        
        if(tempA<tempB)
        {
            return "Cat A";//return answer
        }
        else if(tempA>tempB)
        {
            return "Cat B";//return answer
        }
        else
        {
            return "Mouse C"; //return answer
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
