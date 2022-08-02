class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    int c=0;
	    Node temp=head1;
	    while(temp!=null)
	    {
	        temp=temp.next;
	        c++;
	   }
	   if(c%2==0)
	   {
	       return 0;
	   }
	 return 1;
	}
}
