package Queue;

public class Basic_Queue {

	public int arr[];
	public int arrsize,front,rear;
	
	Basic_Queue(int num)
	{
		arr=new int[num];
		arrsize=num;
		front=-1;
		rear=-1;
	}
	public void Enq(int i)
	{
		if(front==-1&&rear==-1)
		{
		
			arr[++front]=i;
//			System.out.println(arr[front]);
//			System.out.println(front);
			rear+=2;
		}
		else if(rear==arrsize)
		{
			System.out.println("Queue is full");
		}
		else
		{
			arr[rear++]=i;
		}
	}
	public void Deq()
	{
		if(front>=rear)
		{
			System.out.println("Queue is empty now");
		}
		else
		{
			System.out.println(arr[front++]);
		}
	}
	public void Rear()
	{
		System.out.println("Number at the rear Queue is "+arr[--rear]);
		rear++;
	}
	public void Front()
	{
		System.out.println("Number at the front of the Queue is a "+arr[front]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic_Queue s=new Basic_Queue(5);
		s.Enq(1);
		s.Enq(2);
		s.Enq(3);
		s.Enq(4);
		s.Enq(5);
		s.Enq(6);
		
		s.Rear();
		s.Front();
		
		System.out.println("Dequeuinng th list:- ");
		s.Deq();
		s.Deq();
		s.Deq();
		s.Deq();
		s.Deq();
		s.Deq();
	}

}
