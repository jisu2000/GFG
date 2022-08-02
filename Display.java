class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //add code here.
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
