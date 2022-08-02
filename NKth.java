class GfG{
   public static int nknode(Node head, int k){
     float count=0;
      Node newNode=head;
      while(newNode!=null){
          newNode=newNode.next;
          count++;
      }
      float counter=count/k;
      while(counter>1){
          head=head.next;
          counter--;
      }
      return head.data;
   }
}
