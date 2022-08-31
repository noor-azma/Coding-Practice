QUESTION LINK - https://practice.geeksforgeeks.org/problems/peak-element/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions
========================================================ANSWER=====================================================================================
  
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        int m = Integer.MIN_VALUE;
        int pos =0;
      
      
      for(int i =0;i<n;i++)
      {
          if(arr[i]> m)
          {
              m=arr[i];
              pos =i;
          }
      }
      
       return pos;
    }
}
