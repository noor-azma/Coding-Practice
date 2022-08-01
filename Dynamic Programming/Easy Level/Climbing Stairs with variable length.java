QUESTION LINK - https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-with-variable-jumps-official/ojquestion#

=========================================================================================================================================================================
  
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // taking input array
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        //making the dp wala array
        
        int dp[] = new int[n+1];
        
        dp[n] = 1;
        
        //fill the tabulation array
        // i is for dp iterator
        // j is for arr iterator
        
        for(int i = n-1; i>=0; i--){
            for(int j = 1; j<=arr[i] && i+j < dp.length; j++ ){
                dp[i] += dp[i+j];
            }
        }
        
        System.out.println(dp[0]);
    }

}
