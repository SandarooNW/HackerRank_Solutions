//https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    
    double pos=0.0,neg=0.0,zer=0.0;
    
    for(int i =0;i<arr.size();i++)
    {
        if(arr.get(i)>0)
        {
            pos++;
        }
        else if(arr.get(i)<0)
        {
            neg++;
        }
        else
        {
            zer++;
        }
    }
    pos=pos/arr.size();
    neg=neg/arr.size();
    zer=zer/arr.size();
    
    System.out.print(pos+"\n"+neg+"\n"+zer);
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
