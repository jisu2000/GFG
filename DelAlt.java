class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        
        int len=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        temp=head;
        
      
      while(temp!=null && temp.next!=null)
      {
          temp.next=temp.next.next;
          temp=temp.next;
          
          
      }
   }
}
