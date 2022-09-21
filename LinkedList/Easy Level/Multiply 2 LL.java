QUESTION LINK - https://practice.geeksforgeeks.org/problems/multiply-two-linked-lists/1
VIDEO LINK - Analyze the formula to convert a LL to a number

========================================================ANSWER=====================================================================================
  
class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node first,Node second){
          
          long N = 1000000007;
          long a =0, b=0;
          
          while(first != null || second != null){
              
              if(first != null){
                a = (a*10) % N + first.data;
                first = first.next;
              }
              
              if(second != null){
                  b = (b*10) % N + second.data;
                  second = second.next;
              }
          }
          
          a %= N;
          b %= N;
          
          return (a*b) % N;
       
   }
}
