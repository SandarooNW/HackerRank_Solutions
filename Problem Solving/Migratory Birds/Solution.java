//https://www.hackerrank.com/challenges/migratory-birds/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
       int[] array = new int[5];
    
    for(int i=0;i<arr.size();i++)
    {
        switch(arr.get(i))
    {
        case 1:
        
           array[0]++;
           break;
        case 2:
           array[1]++;
           break;
         case 3:
        
           array[2]++;
           break;
        case 4:
           array[3]++;
           break;
        case 5:
           array[4]++;
           break;
            
        
    } 
    }
    int temp=0,h=array[0];
    
    for(int j=0;j<5;j++)
    {
        temp=h;
       
        if(temp<=array[j])
        {
            h=array[j];
          
        }
        
    }
   
   int l=0;
        for( ;l<5;l++)
        {
            if(h==array[l])
            {
                break;
                
            }
            
        }
    
    return l+1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
