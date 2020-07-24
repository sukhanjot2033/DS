package linkedlist;

public class linkedlistInsAtNum {

	public Node head=null;
	public static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public  void ins(int dd)
	{
		Node s =new Node(dd);
		if(head==null)
			{head=s;}
		else
		{
			Node u=head;
			while(u.next!=null)
			{
				u=u.next;
			}
			u.next=s;
		}
	}
	public void display()
	{
		Node k=head;
		while(k!=null)
		{
			System.out.print(k.data+"  ");
			k=k.next;
		}
		System.out.println();
	}
	public void insAt(int num,int dd)
	{
		Node a=head;
		Node j=new Node(num);
		Node n=null;
		if(a.next.data==dd)
		{
			n=a.next;
		}
		else
		{
		while(a.next.data!=dd)
		{
			a=a.next;
			 n=a.next;
		}
		}
		//System.out.println(a.data);
		a.next=j;
		j.next=n;
	}
	public static void main(String [] ar)
	{
		linkedlistInsAtNum obj=new linkedlistInsAtNum();
		obj.ins(1);
		obj.ins(2);
		obj.ins(3);
		obj.ins(4);
		obj.ins(5);
		obj.ins(6);
		obj.display();
		
		
		obj.insAt(14,4);
		obj.insAt(13,3);
		obj.insAt(12,5);
		obj.insAt(11,2);
		obj.insAt(15,6);
		obj.display();
	}
}
