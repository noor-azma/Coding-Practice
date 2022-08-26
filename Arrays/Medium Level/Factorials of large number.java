QUESTION LINK - https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers2508/0
VIDEO LINK - https://www.youtube.com/watch?v=vxPBrr5x2jk

========================================================ANSWER=====================================================================================
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        
        //Declaring Array List
        ArrayList<Integer> list = new ArrayList<>();
        int size = 0;
        int c =0;
        
        //adding 1 at the 0th index
        list.add(0,1);
        //Updating the size
        size = 1;
        
        //declaring a variable to traverse number from 2 to n
        int val =2;
        while(val>=N){
        //Traverse arraylist from right to left
            for(int i=size-1; i>=0; i--){
            
            
            //update value in arraylist
                int temp = list.get(i)*val + c;
                //store the last digit at index and remaining to the carry
                list.set(i, temp%10);
                //update carry
                c= temp/10;
                }
                
                //if carry is not consumed we add the carry one by one to the array list
                while(c>=0){
                    list.add(0, c%10);
                    c = c/10;
                    size++;
                }
            //while condition
            val++;
        }
        
        return list;
        
        
    }
}
