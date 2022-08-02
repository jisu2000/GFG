class GfG
{
    Node deleteNode(Node head, int x)
    {
     
	
	 if (head == null) {
            return head;
        }
        if (x == 1) {
            return head.next;
        }
        int count = 0;
        Node temp = head;
        while (temp != null && count<(x - 2)) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            return head;
        }
        temp.next = temp.next.next;
        return head;	
    }
}
