QUESTION LINK - https://practice.geeksforgeeks.org/problems/minimum-swaps/1
VIDEO LINK - dry run
========================================================ANSWER=====================================================================================

class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int swapCount = 0;
        int visited[] = new int[nums.length];
        
        //fill visited array same as original array
        for(int i =0; i<nums.length; i++){
            
            visited[i] = nums[i];
        }
        
        //sort the "visted" array
        Arrays.sort(visited);
        
        //fill the hashmap
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i] , i);
        }
        
        //check for swaps
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != visited[i]){
                ++swapCount;
                
                int temp =map.get(visited[i]);
                int value = nums[i];
                
                //now swap
                int t = nums[i];
                nums[i] = nums[temp];
                nums[temp] = t;
                
                //update hm with swapped values
                map.put(nums[i] , i);
                map.put(value, temp);
            }
        }
        
        return swapCount;
        
    }
}
