QUESTION LINK - https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
VIDEO LINK - ask adarsh
APPROACH - Create a hashmap and store freq of each element. if freq is more than 1 return that element
========================================================ANSWER=====================================================================================
//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
       // Arrays.sort(arr);
        
        HashMap <Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            
            if(hm.containsKey(arr[i])){
                int oldFreq = hm.get(arr[i]);
                int newFreq = oldFreq + 1;
                hm.put(arr[i], newFreq);
            }
            
            else hm.put(arr[i] , 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int key : hm.keySet()){
            
            if(hm.get(key) > 1){
                list.add(key);
            }
        }
        
        if(list.size() == 0) list.add(-1);
        Collections.sort(list);
        return list;
    }
}
