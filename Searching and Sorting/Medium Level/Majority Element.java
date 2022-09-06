QUESTION LINK - https://practice.geeksforgeeks.org/problems/majority-element/0
VIDEO LINK - easy hai

========================================================ANSWER=====================================================================================
  
class Solution
{
    static int majorityElement(int arr[], int size)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<size; i++){
            
            hm.put(arr[i], hm.get(arr[i]) == null ? 1 : hm.get(arr[i]) + 1);
        }
      
        int n = size/2;
        for(int i=0; i<size; i++){
            if(hm.get(arr[i]) > n) return arr[i];
        }
        
        return -1;
    }
}

====================================================================ANOTHER SOLUTION=======================================================================
class Solution
{
   static int majorityElement(int a[], int size)
   {
       int [] N = new int [10000001];
       
       
       for(int i = 0; i<size; i++){
           
           N[a[i]]++;
           
           if(N[a[i]] > size/2){
               
               return a[i];
               
           }
           
           
           
       }
   
       return -1;
   }
   
}
