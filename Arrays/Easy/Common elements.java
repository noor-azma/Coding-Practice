QUESTION LINK - https://practice.geeksforgeeks.org/problems/common-elements1132/1
  
APPROACH - Use TreeSet to implemet a Set because in TreeSet the elements are in sorted order

=====================================================================ANSWER===========================================================================================
  

//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();
        Set<Integer> s3 = new TreeSet<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        //filling the set1
        for(int i=0; i<n1; i++)
            s1.add(A[i]);
        
        //filling the set2    
        for(int j=0; j<n2; j++)
            s2.add(B[j]);
            
        //filling the set3
        for(int k=0; k<n3; k++)
            s3.add(C[k]);
            
        
            
        //now filling the answer array list
        for(int i : s1){
            if(s2.contains(i) && s3.contains(i)){
                answer.add(i);
            }
            
        }
        
        return answer;
        
    }
}
