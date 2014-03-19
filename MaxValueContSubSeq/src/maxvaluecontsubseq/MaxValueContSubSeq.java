/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxvaluecontsubseq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author prabh_000
 */
public class MaxValueContSubSeq {

    
    static void maxContSubSequence(int[] arr)
    {
        int[] optsum=new int[arr.length];
        optsum[0]=arr[0];
        int maxsum=0;
                
        int start=0;
        int end=0;
        for(int i=1;i<optsum.length;i++)
        {
          if(optsum[i-1]+arr[i]<arr[i])
          {
           start=i; 
          }
          optsum[i]=Math.max(optsum[i-1]+arr[i], arr[i]);
          if(optsum[i]>maxsum)
          {
          maxsum=optsum[i];
          end=i;
          }
        }
        System.out.print("The maximum value contiguous sub sequence is:");
        for(;start<=end;start++)
        {
            System.out.print(arr[start]+" "); 
        } 
        System.out.println("\nThe Maximum Value Contiguous Sequence in the given array is:"+maxsum);
    
       
    }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;        
        int size=0;
      
        System.out.println("Enter the size of the array");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        Scanner read=new Scanner(System.in);
       
        size=read.nextInt();
        int[] arry=new int[size];
        
        System.out.println("Enter the array");
        
        while(i<size) 
        {
         arry[i]=read.nextInt();
         i++;
        }
        read.close();
        maxContSubSequence(arry);

}
}
