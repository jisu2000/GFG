class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        int count=0;
        // if(head.next==null)
        // {
        //     return 1;
        // }
        
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }
}
