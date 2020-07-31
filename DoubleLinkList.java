package DoubleLinkedlist;

public class DoubleLinkList {

	public Node head;
    public class Node
    {
    	int data;
    	Node next;
    	Node prev;
    	Node(int dd){
    		data=dd;
    		next=null;
    		prev=null;
    	}
    }
    public void beg(int d)
    {
    	Node s=new Node(d);
    	if(head==null)
    	{
    		head=s;
    		s.next=null;
    		s.prev=null;
    	}
    	else
    	{
    	  Node u=head;
    	  u.prev=s;
    	  s.next=u;
    	  head=s;
    	  //s.prev=null;
    		
    	}
    }
    public void end(int d)
    {
    	Node k=new Node(d);
    	if(head==null)
    	{
    		head=k;
    		k.next=null;
    		k.prev=null;
    	}
    	else
    	{
    		Node h=head;
    		while(h.next!=null)
    		{
    			h=h.next;
    		}
    		h.next=k;
    		k.prev=h;
    		//k.next=null;
    	}
    }
    public void print()
    {
    	Node k=head;
    	while(k!=null)
    	{
    		System.out.println(k.data);
    		k=k.next;
    	}
    }
    public static void main(String []args)
    {
    	DoubleLinkList obj = new DoubleLinkList();
    	obj.beg(1);
    	obj.beg(2);
    	obj.beg(3);
    	obj.beg(4);
    	
    	
    	obj.end(11);
    	obj.end(12);
    	obj.end(13);
    	obj.end(14);
    	
    	
    	obj.print();
    }
}
