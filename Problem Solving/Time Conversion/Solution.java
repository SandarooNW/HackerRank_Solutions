//https://www.hackerrank.com/challenges/time-conversion/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
     int t=0;
     if(s.charAt(8)=='P')
     {
         String temp=s.substring(0,2);
         
         if(temp.equals("12")==false)
         {
              t= Integer.parseInt(temp);
              
              int j=13;
         for(int i =1;i<=11;i++)
         {
             if(i==t)
             {
                 t=j;
                 
             }
             j++;
             
         }
          return    s.replace(s.substring(0, 2),String.valueOf(t)).substring(0,8);
         
         }
         else
         {
              return s.substring(0,8);
         }
     
     }
     else
     {
          String temp=s.substring(0,2);
          String e = "00";
         if(temp.equals("12")==true)
         {
        return    s.replace(s.substring(0, 2),e).substring(0,8);
         }
         return s.substring(0,8);
     }
      

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
