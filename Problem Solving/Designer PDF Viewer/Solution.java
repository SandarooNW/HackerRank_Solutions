//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
     
    char c ='a',test='a';
    int he =0,temp=0,n=0,t=h.get(0);
   
    for(int i=0;i<word.length();i++)
    {
        test=word.charAt(i);
        c='a';

        for(int k=0;k<h.size();k++)
        { 
         t=h.get(k);//kth value in h
        
         temp=he;//temp value

        if(c==test)//if temp and c equal
        {
            if(temp<t)//compare
            { 
                he=t;//set he
            }
         

        }
           c++;//increase c
            
        }
       
        
    }
    
    return he*word.length();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] hTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hTemp[i]);
            h.add(hItem);
        }

        String word = bufferedReader.readLine();

        int result = Result.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
