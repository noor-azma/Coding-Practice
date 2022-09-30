QUESTION LINK - https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&difficulty[]=0&sortBy=submissions

========================================================ANSWER=====================================================================================
  
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        
        ArrayList<Integer>res=new ArrayList<>();

 

        int rmax=Integer.MIN_VALUE;

        // Your code here

        for(int i=arr.length-1;i>=0;i--){

            if(arr[i]>=rmax){

                res.add(arr[i]);

                rmax=arr[i];

            }


        }

        Collections.reverse(res);

        return res;
    }
}
