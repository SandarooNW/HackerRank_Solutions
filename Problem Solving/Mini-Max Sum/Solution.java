//https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
public static long[] sumArray(List<Integer> ar)
{
    long[] array = new long[ar.size()];
    long sum =0;
      for(int i =0;i<ar.size();i++)
    {
        sum=0;
        for(int j =0;j<ar.size();j++)
        {
            if(j==i)
            {
                continue;
            }
            else
            {
                sum+=ar.get(j);
            }
            
        }
        array[i]=sum;
        
    }
    return array;
}
    public static void miniMaxSum(List<Integer> arr) {
    long[] array = new long[arr.size()];
    array=sumArray(arr);
    
    
  
    long max=array[0],min=array[0],temp=0,tempm=0;
       for(int i =0;i<arr.size();i++)
       {
           temp=max;
           tempm=min;
           for(int j =0;j<arr.size();j++)
           {
               if(array[i]>array[j])
               {
                   max=array[i];
                   
               }
               if(array[i]<array[j])
               {
                   min=array[i];
               }
           
           }
           if(temp>max)
           {
               max=temp;
           }
            if(tempm<min)
           {
               min=tempm;
           }
          
       }
       System.out.print(min+" "+max);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
