//https://www.hackerrank.com/challenges/drawing-book/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
   //answer
    int i=1,k=n,t=0,b=0;
    while(i<p)
    {
      
        i=i+2;
        b++;
    }
    if(n%2 !=0)
    {
        n=n-1;
        k=n;
    }
  
    while(k>p)
    {
        k=k-2;
        t++;
    }
    if(p==1)
    {
        return 0;
    }
   
    else if(t>b)
    {
       
        return b;
       
    }
    else
    {
        
        return t;
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
