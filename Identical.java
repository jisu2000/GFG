class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        int l=0;
        int l1=0;
        int count=0;
        Node temp=head1;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
         Node temp1=head2;
        while(temp1!=null){
            temp1=temp1.next;
            l1++;
        }
        
        while(head1!=null && head2!=null)
        {
            if(head1.data==head2.data)
            {
                count++;
            }
            head1=head1.next;
            head2=head2.next;
        }
        if(count==l && count==l1){
            return true;
        }
        return false;
    }
}
