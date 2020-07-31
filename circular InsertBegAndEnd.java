package CircularLinklist;

import linkedlist.linkedlistBegAndEnd;

public class InsertBegAndEnd {
	 class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) {    
	            this.data = data;    
	            next = null;    
	        }    
	    }    
	//Represent the head of the singly linked list    
	    public Node head = null; 
	    public Node tail = null;
	    
	    
public void insertend(int ddd)
{
	Node s=new Node(ddd);
	if(head==null)
	{
		head=s;
		tail=s;
		s.next=head;
	}
	else
	{
		tail.next=s;
		tail=s;
		tail.next=head;
	    
		
	}
}
public void beg(int ddd)
{
	Node u=new Node(ddd);
	if(head==null)
	{
		head=u;
		tail=u;
		u.next=head;
	}
	else {
	Node k=head;
    u.next=k;
    head=u;
    tail.next=head;
	}
}
	    public void print()
	    {
	    	Node k=head;
	    	do {
	    		System.out.println(k.data);
	    		k=k.next;
	    	}
	    	while(k!=head);
	    }
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			InsertBegAndEnd ob= new InsertBegAndEnd();
			
			ob.insertend(55);
			ob.insertend(23);
			ob.insertend(20);
			ob.insertend(40);
			
            ob.beg(1);
            ob.beg(2);
            ob.beg(3);
			ob.print();
		}
}
