class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         int mid;
         int l=0;
         int i=0;
         Node temp=head;
         while(temp!=null)
         {
             temp=temp.next;
             l++;
         }
         
        mid=l/2+1;
        Node temp2=head;
        while(i<mid-1)
        {
            temp2=temp2.next;
            i++;
        }
        return temp2.data;
    }
}
