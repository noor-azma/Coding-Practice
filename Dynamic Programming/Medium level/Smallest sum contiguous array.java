QUESTION LINK - https://practice.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1
VIDEO LINK - Reverse of Kadane's algo

========================================================ANSWER=====================================================================================

class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {
        // your code here
        int cs = a[0];
        int os = a[0];
        
        for(int i=1; i<a.length; i++){
            
            cs = Math.min(a[i], cs + a[i]);
            os = Math.min(cs, os);
        }
        
        return os;
    }
}
