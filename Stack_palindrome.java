package stacks;

public class Stack_palindrome {
  public int arr[];
  public int cap;
  public int top;
  Stack_palindrome(int size)
  {
	  arr=new int[size];
	  cap=size;
	  top=-1;
  }
  public void  push(int d)
  {
	  if(top==cap-1)
	  {
		  System.out.println("stack is full");
	  }
	  else
	  {
		  arr[++top]=d;
	  }
  }
  public void palindrome()
  {
	  int i=0;
	  int flag=0;
	  int j=cap/2;
	  while(i<j)
	  {
		  if(arr[i]==arr[top--])
		  {
			  flag=1;
		  }
		  else 
		  {
			  flag=0;
		  break;
		  }
		  i++;
	  }
	  if(flag==1)
	  {
		  System.out.println("Number is palindrome");
	  }
	  else
		  System.out.println("Number is not palinfrome");
  }
  public static void main(String[] ar)
  {
	  Stack_palindrome a=new Stack_palindrome(5);
	  a.push(1);
	  a.push(2);
	  a.push(3);
	  a.push(2);
	  a.push(1);
	  a.palindrome();
  }
  
}
