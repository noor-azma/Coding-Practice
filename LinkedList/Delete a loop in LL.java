QUESTION LINK - https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
VIDEO LINK - https://www.youtube.com/watch?v=aIR0s1tY2Vk

========================================================ANSWER=====================================================================================


class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                break;
            }
        }
        
        
        if(slow == head){
            while(fast.next != slow){
                fast = fast.next;
            }
            
            fast.next = null;
        }
        
        else if(slow == fast){
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
        
    
    }
}

============================================CAN ALSO BE DONE USING HASHMAP(to implement it watch the video and also detect a loop video of same guy===================
