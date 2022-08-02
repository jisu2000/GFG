
class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      int l=0;
     Node temp=head;
     while(temp!=null)
     {
         temp=temp.next;
         l++;
     }
     int i=1;
     while(i<=l-k)
     {
         head=head.next;
         i++;
     }
     int sum=0;
     while(head!=null)
     {
         sum=sum+head.data;
         head=head.next;
     }
     return sum;
    }
}
