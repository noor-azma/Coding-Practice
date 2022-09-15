QUESTION LINK - https://practice.geeksforgeeks.org/problems/sort-a-stack/1
VIDEO LINK - https://www.youtube.com/watch?v=MOGBRkkOhkY
             https://www.youtube.com/watch?v=lDThYwMDNTU

========================================================ANSWER=====================================================================================
  
without using recursion

class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
	    int[] arr = new int[s.size()];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.pop();
		}
	    java.util.Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
		    s.push(arr[i]);
		}
		return s;
	}


===================By using recursion===============================

class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
	    if(s.isEmpty()) return s;
	    
		int a = s.pop();
		
		sort(s);
		
		insertatCorrectPosn(s, a);
		
		return s;
		
	}
	
	void insertatCorrectPosn(Stack<Integer> s, int a){
	    
	    if(s.isEmpty() || s.peek()<a) {
	        s.push(a);
	        return;
	    }
	    
	    int b = s.pop();
	    insertatCorrectPosn(s, a);
	    s.push(b);
	    //return s;
	    
	}
}

