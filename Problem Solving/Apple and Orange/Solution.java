//https://www.hackerrank.com/challenges/apple-and-orange/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int numA=0,numO=0;
    for(int i =0;i<apples.size();i++)
    {
        apples.set(i,apples.get(i)+a);
        if(s<=apples.get(i)&&t>=apples.get(i))
        {
            numA++;
        }
    }
    for(int i =0;i<oranges.size();i++)
    {
        oranges.set(i,oranges.get(i)+b);
        if(s<=oranges.get(i)&&t>=oranges.get(i))
        {
            numO++;
        }
    }
    System.out.print(numA+"\n"+numO);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        String[] applesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> apples = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesTemp[i]);
            apples.add(applesItem);
        }

        String[] orangesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> oranges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesTemp[i]);
            oranges.add(orangesItem);
        }

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
