QUESTION LINK - https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1
VIDEO LINK - dry run

========================================================ANSWER=====================================================================================
  
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        
        List<Integer> list= new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        list.add(-1);//for first element there is no left so it will always be -1
        st.push(a[0]);//push the first element in stack
        
        for(int i=1; i<a.length; i++){
            
            while(!st.isEmpty() && st.peek() >= a[i]  ){
                
                st.pop();
                
            }
            
            if(st.isEmpty()) list.add(-1);
            
            else if(a[i] > st.peek() ){
                
                list.add(st.peek());
            }
            
            st.push(a[i]);
           
        }
        
        return list;
       
    }
}
