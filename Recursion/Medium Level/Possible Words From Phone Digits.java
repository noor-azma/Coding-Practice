QUESTION LINK - https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1
VIDEO LINK - https://www.youtube.com/watch?v=3fjt19bjs3A&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=27

========================================================ANSWER=====================================================================================
  

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    
    static String arr[] = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static ArrayList <String> possibleWords(int a[], int N)
    {
        //base case
        if(a.length == 0){
            ArrayList<String> baseAns = new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        
        //store thr first character
        int ch = a[0]; // separate 2
        
        int subArray[] = new int[N-1];// separate 34
        
        for(int i=0; i<subArray.length; i++) subArray[i] = a[i+1];// store34 in new array
        int n = subArray.length;
        
        ArrayList<String> smallAns = possibleWords(subArray, n ); // recursive call for 34
        
        ArrayList<String> ans = new ArrayList<>();// now add characters of 2 tp 34 to get final ans
        
        String character = arr[ch-1];
        
        for(int i=0; i<character.length(); i++){
            
            char code = character.charAt(i);
            
            for(String resStr : smallAns){
                ans.add(code + resStr);
            }
        }
        
        Collections.sort(ans);
        
        return ans;
        
        
        
    }
}
