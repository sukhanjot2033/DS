package linkedlist;

public class linkedlistBegAndEnd {
	
		 class Node{    
		        int data;    
		        Node next;    
		            
		        public Node(int data) {    
		            this.data = data;    
		            //this.next = null;    
		        }    
		    }    
		//Represent the head of the singly linked list    
		    public Node head = null; 
		    
		  //display() will display all the nodes present in the list    
		    public void display() {    
		        //Node current will point to head    
		        Node current = head;    
		            
		        if(head == null) {    
		            System.out.println("List is empty");    
		            return;    
		        }    
		        System.out.println("Nodes of singly linked list: ");    
		        while(current != null) {    
		            //Prints each node by incrementing pointer    
		            System.out.print(current.data + " ");    
		            current = current.next;    
		        }    
		        System.out.println();    
		    }    
		    
		    public void insertBeg(int data)
		    { //Create a new node    
		        Node temp = new Node(data);
		        //Checks if the list is empty    
		        if(head == null) {    
		        	 head = temp; 
		        }
		        else
		        {
		        	temp.next=head;
		        	head = temp; 
		        }
		    }
		    
		    public void insertEnd(int data)
		    {
		    	//Create a new node    
		        Node temp = new Node(data);
		        //Checks if the list is empty    
		        if(head == null) {    
		        	 head = temp; 
		        }
		        
		        else
		        {
		        	Node last = head;
		        	while (last.next != null) { 
		                last = last.next; 
		            } 
		        	
		        	// Insert the new_node at last node 
		            last.next = temp; 
		        }
		    }
		    public void deletionBeg()
		    {
		    	if(head==null)
		    	{
		    		System.out.println("LIST IS EMPTY");
		    	}
		    	else
		    	{
		    		Node temp=head;
			    	head=head.next;
			    	temp=null;
		    	}
		    	
		    }
		    

		  
		    public void deletionEnd()
		    {
		    	if(head==null)
		    	{
		    		System.out.println("LIST IS EMPTY");
		    	}
		    	else
		    	{
		    		Node secondlast=head;
		    		while(secondlast.next.next!=null)
		    		{
		    			secondlast=secondlast.next;
		    		}
		    		Node last=secondlast.next;
		    		secondlast.next=null;
		    		last=null;
		    		
		    		
		    	}
		    }
		    
		    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			linkedlistBegAndEnd ob= new linkedlistBegAndEnd();
			
			ob.insertBeg(2);
			ob.insertBeg(23);
			ob.insertBeg(20);
			ob.insertBeg(40);
			
			ob.display();
		
			ob.insertEnd(45);
			ob.insertEnd(50);
			ob.display();
			
//			ob.deletionBeg();
//			ob.display();
//			
//			ob.deletionEnd();
//			ob.display();
//	        
			
		}

	}
