package stacks;

public class stackArray {
	
		public int arr[];
		public int capa;
		public int top;
		stackArray(int size)
		{
			arr=new int[size];
			top=-1;
			capa=size;
		}
	public boolean push(int d)
	{
		if((top)==(capa-1))
		{
			System.out.println("stack is full");
			return false;
		}
		else 
		{
			arr[++top]=d;
			return true;
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{System.out.println(arr[top--]);}	
	}
	public static void main(String [] ar)
	{
		stackArray st=new stackArray(3);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
	}

}
