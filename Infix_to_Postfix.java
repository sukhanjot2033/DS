package INFIX;
import java.util.*;

public class Infix_to_Postfix {
	  

	    // A utility function to return precedence of a given operator 
	    // Higher returned value means higher precedence 
	    static int Prec(char ch) 
	    { 
	        switch (ch) 
	        { 
	        case '+': 
	        case '-': 
	            return 1; 
	       
	        case '*': 
	        case '/': 
	            return 2; 
	       
	        case '^': 
	            return 3; 
	        } 
	        return -1; 
	    } 
	       
	    // The main method that converts given infix expression 
	    // to postfix expression.  
	    static String infixToPostfix(String exp) 
	    { 
	        // initializing empty String for result 
	        String result = new String(""); 
	        // initializing empty stack 
	        Stack<Character> stack = new Stack<>(); 
	          
	        for (int i = 0; i<exp.length(); ++i) 
	        { 
	            char c = exp.charAt(i); 
	              
	             // If the scanned character is an operand, add it to output. 
	            if (Character.isLetterOrDigit(c)) 
	                {result += c;
	                System.out.println("..."+c);
	                }
	               
	            // If the scanned character is an '(', push it to the stack. 
	            else if (c == '(') 
	                stack.push(c); 
	              
	            //  If the scanned character is an ')', pop and output from the stack  
	            // until an '(' is encountered. 
	            else if (c == ')') 
	            { 
	                while (!stack.isEmpty() && stack.peek() != '(') 
	                    result += stack.pop(); 
	                  
	                if (!stack.isEmpty() && stack.peek() != '(') 
	                    return "Invalid Expression"; // invalid expression                 
	                else
	                    stack.pop(); 
	            } 
	            else // an operator is encountered 
	            { 
	                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
	                    if(stack.peek() == '(') 
	                        return "Invalid Expression"; 
	                    char jj=stack.pop();
	                    System.out.println("----"+jj);
	                    result += jj; 
	                    
	             } 
	                stack.push(c); 
	            } 
	       
	        } 
	       
	        // pop all the operators from the stack 
	        while (!stack.isEmpty()){ 
	            if(stack.peek() == '(') 
	                return "Invalid Expression"; 
	            result += stack.pop(); 
	         } 
	        return result; 
	    } 
	    
	    // Driver method  
	    public static void main(String[] args)  
	    { 
	        String exp = "a+b*(c^d-e)"; 
	        System.out.println(infixToPostfix(exp)); 
	    } 
}
//^(f+g*h)-i
