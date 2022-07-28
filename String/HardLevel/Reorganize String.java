QUESTION LINK - https://leetcode.com/problems/reorganize-string/submissions/

==========================================================================================================================================================================
  
  class Solution {
    public String reorganizeString(String s) {
        
        int hash[] = new int[26];
        
        for(int i=0; i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
        }
        
        int letter =0;
        int max = 0;
        
        for(int i =0; i<hash.length; i++){
            if(max < hash[i]){
                max= hash[i];
                letter = i;
            }
        }
        
        if(max > (s.length()+1)/2){
            return "";
        }
        
        char result[] = new char[s.length()];
        int index = 0;
        while(hash[letter] > 0){
            result[index ]= (char) (letter + 'a');
            index = index +2;
            hash[letter]--;
        }
        
        for(int i =0; i<hash.length ; i++){
            while(hash[i] > 0){
                if(index >= result.length)
                    index = 1;
                result[index] =(char) (i+'a');
                index = index +2;
                hash[i]--;
            }
        }
        
        return String.valueOf(result);
        
    }
    
    SEE ADARSH CODE FOR COMMENTS
}
