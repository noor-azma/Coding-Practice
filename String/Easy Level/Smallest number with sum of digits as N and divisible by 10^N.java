QUESTION LINK - https://practice.geeksforgeeks.org/problems/smallest-number-with-sum-of-digits-as-n-and-divisible-by-10n4032/1
VIDEO LINK - https://www.youtube.com/watch?v=zQCyarehr9s

========================================================ANSWER=====================================================================================
  
class Solution
{
    public String digitsNum(int N)
    {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++){
            
            sb.append('0');
        }
        
        while(N!=0){
            
            if(N>9){
                sb.insert(0, 9);
                N-=9;
                
            }
            
            else {
                
                sb.insert(0, N);
                N-=N;
            }
        }
        
        return sb.toString();
    }
}
