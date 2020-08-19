package Queue;

public class Circular_Queue {

	public int arr[];
	public int arrsize,rear,front;
	 
	Circular_Queue(int num)
	{
		arr=new int[num];
		arrsize=num;
		front=-1;
		rear=0;
	}
	
	public void enq(int i)
	{
		if(rear==front)
		{
			System.out.println("Queue is full");
			System.exit(1);
		}
		if(front==-1)
		{	front=rear;
		}
		arr[rear]=i;
		rear=(rear+1)%arrsize;
	}
	public void deq()
	{
		if(front==-1)
		{
			System.out.println("Queue is fully empty");
			System.exit(1);
		}
		System.out.println(arr[front]);
		front=(front+1)%arrsize;
		if(front==rear)
		{
			front=-1;
		}
	}
	
	public static void main(String [] ar)
	{
		Circular_Queue s =new Circular_Queue(5);
		s.enq(1);
		s.enq(2);
		s.enq(3);
		s.enq(4);
		s.enq(5);
		//s.enq(6);
		
		s.deq();
		s.deq();
		s.deq();
		
		s.enq(11);
		s.enq(12);	
		
		s.deq();
		s.deq();
		
		s.deq();
		s.deq();
	}
}
