//https://www.hackerrank.com/challenges/utopian-tree/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
    int h =1;
      if(n==0)
        {
            h=1;//if n is 0 assign 1 to h
        }
     else
     {   
    for(int i =1;i<=n;i++)//loop untill i met n value
    {
      if(i%2==0)//if devisible by 2 
        {
            h++;//increase h
        }
        else
        {
            h=h*2;//if can't devide by 2 change h by multiplying by 2
        }
    }
     }
    return h; //return answer

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.utopianTree(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
