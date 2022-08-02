class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       
       Node temp=node;
       int i=0;
       
       while(i<ind-1)
       {
           temp=temp.next;
           i++;
       }
       return temp.data;
    }
}
