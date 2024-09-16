//https://www.hackerrank.com/challenges/sock-merchant/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        int count=0,pairs=0;
        int flag=0;

        
    for(int i=0;i<n;i++)
    {
        count=1;
        flag=0;
        if(i !=0 )
        {
           for(int h=0;h<i;h++)
           {
               if(ar.get(h)==ar.get(i))
               {
                   flag++;
               }
               
           }
        }
        if(flag==0)
        { for(int k=i+1;k<n;k++)
           {
               if(ar.get(k)==ar.get(i) )
               {
                   count++;
                  
               }
            
           }
          pairs =pairs+(count/2);
             
        }
        else
        {
            continue;
            
           
        }
    
    }
    return pairs;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
