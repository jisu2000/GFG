class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        int l=0;
        int mid;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            l++;
        }
        if(l%2!=0)
        {
            mid=(l/2)+1;
        }
        else{
            mid=l/2;
        }
        Node add=new Node(data);
        int i=0;
        Node temp2=head;
        while(i<mid-1){
            temp2=temp2.next;
            i++;
        }
        add.next=temp2.next;
        temp2.next=add;
        
        return head;
        
    }
}
