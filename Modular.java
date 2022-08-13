class GfG
{
    public static int moduarNode(Node head, int k)
    {
        // add your code here
        int res=-1;
        Node temp=head;
        int i=1;
        while(temp!=null)
        {
            if(i%k==0)
            {
                res=temp.data;
            
            }
            temp=temp.next;
            i++;
        }
        
        return res;
    }
}
