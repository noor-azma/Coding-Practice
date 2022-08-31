QUESTION LINK - https://practice.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1

===============================================================================ANSWER==================================================================================
class Solution {
    String removeDuplicates(String str) {
        
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i=0; i<str.length(); i++){
            
            if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }
            
            else continue;
        }
        
        String Str = "";
        
        for(int i=0; i<list.size(); i++){
            
            Str+= list.get(i);
            
        }
        
        return Str;
    }
}
