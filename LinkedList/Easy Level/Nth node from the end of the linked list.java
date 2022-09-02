QUESTION LINK - https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

========================================================ANSWER=====================================================================================
class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	int count =0;
    	Node temp = head;
    	
    	while(temp !=null){
    	    count++;
    	    temp = temp.next;
    	}
    	
    	int endval = count; 
    	int j = 0;
    	
    	Node temp2 = head;
    	
    	if(n>endval){
            return -1;
        }
        else{
        	while(j != (count-n)){
        	    j++;
        	    temp2=temp2.next;
        	}
        }
    	
    	return temp2.data;
    }
}
