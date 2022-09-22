QUESTION LINK - https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1
VIDEO LINK - https://www.youtube.com/watch?v=QDBrZFROuA0&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=12 

========================================================ANSWER=====================================================================================
  
class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        
        if(N == 0) return 0;
        long count =0;
        
        long a = toh(N-1, from, aux, to);
        System.out.println("move disk" +" " + N +" " + "from rod" + " " + from +" " + "to rod" + " "+ to);
        
        long b = toh(N-1, aux, to, from);
            
        return a+b+1;
       
    }
    
}
