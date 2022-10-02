QUESTION LINK - https://practice.geeksforgeeks.org/problems/minimum-characters-to-be-added-at-front-to-make-string-palindrome/1
VIDEO LINK - https://www.youtube.com/watch?v=y1o7ygP-VpQ
Note - its an easy question only just added in hard coz in gfg it was in hard level
There are 2 approaches. first one is brute force. other is optimised
========================================================ANSWER=====================================================================================
  
class Solution {
    public static int minChar(String str) {
       int end = str.length()-1;
       
       while(end>=0){
           if(isPal(str, end)){
               return str.length()-1-end;
           }
           
           end--;
       }
       return -1;
    }
    
   static boolean isPal(String str, int j){
        int i=0;
        
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}

-----------------------------------------------------------------SEE VIDEO FOR OTHER APPROACH------------------------------------------------------------------------
