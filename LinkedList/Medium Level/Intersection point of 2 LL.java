QUESTION LINK - https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
Ad solved it

========================================================ANSWER=====================================================================================
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         int len1 = 1;
         int len2 = 1;
         int ans = -1;
         
         Node t1 = head1;
         Node t2 = head2;
         
         //finding length of first LL
         while(t1 != null){
             len1++;
             t1 = t1.next;
         }
         
         //finding length of second LL
         while(t2 != null){
             len2++;
             t2 = t2.next;
         }
         
         
         while(len1 > len2){
             head1 = head1.next;
             len1--;
         }
         
         while(len2 > len1){
             head2 = head2.next;
             len2--;
         }
         
         while(head1 != null && head2 != null){
             if(head1 == head2){
                 ans = head1.data;
                 break;
             }
             head1 = head1.next;
             head2 = head2.next;
         }
         
         return ans;
	}
}


