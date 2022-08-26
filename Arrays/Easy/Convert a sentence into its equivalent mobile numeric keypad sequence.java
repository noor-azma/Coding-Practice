QUESTION LINK - https://practice.geeksforgeeks.org/problems/convert-a-sentence-into-its-equivalent-mobile-numeric-keypad-sequence0547/0

========================================================ANSWER=====================================================================================
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String s) 
    { 
         String ans ="";
        for(int i=0;i<s.length();i++){
            
              if(s.charAt(i)=='A'){ans+="2";}
              else if(s.charAt(i)=='B'){ans+="22";}
              else if(s.charAt(i)=='C'){ans+="222";}
              else if(s.charAt(i)=='D'){ans+="3";}
              else if(s.charAt(i)=='E'){ans+="33";}
              else if(s.charAt(i)=='F'){ans+="333";}
              else if(s.charAt(i)=='G'){ans+="4";}
              else if(s.charAt(i)=='H'){ans+="44";}
              else if(s.charAt(i)=='I'){ans+="444";}
              else if(s.charAt(i)=='J'){ans+="5";}
              else if(s.charAt(i)=='K'){ans+="55";}
              else if(s.charAt(i)=='L'){ans+="555";}
              else if(s.charAt(i)=='M'){ans+="6";}
              else if(s.charAt(i)=='N'){ans+="66";}
              else if(s.charAt(i)=='O'){ans+="666";}
              else if(s.charAt(i)=='P'){ans+="7";}
              else if(s.charAt(i)=='Q'){ans+="77";}
              else if(s.charAt(i)=='R'){ans+="777";}
              else if(s.charAt(i)=='S'){ans+="7777";}
              else if(s.charAt(i)=='T'){ans+="8";}
              else if(s.charAt(i)=='U'){ans+="88";}
              else if(s.charAt(i)=='V'){ans+="888";}
              else if(s.charAt(i)=='W'){ans+="9";}
              else if(s.charAt(i)=='X'){ans+="99";}
              else if(s.charAt(i)=='Y'){ans+="999";}
              else if(s.charAt(i)=='Z'){ans+="9999";}
              else{ans+="0";}
           }
            return ans;
    }
}
