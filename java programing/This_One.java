import java.lang.String;
import java.util.Scanner;
class Stack
{
    int stack[] = new int[10];
    int tos;
    
    /* initialize top-of-stack */
    Stack()
    {
        tos = -1;
    }
    
    /* push an item onto the stack */
    void push(int item)
    {
        if(tos == 9)
        {
            System.out.println("Stack is full..!!");
        }
        else
        {
            stack[++tos] = item;
        }
    }
    
    /* pop an item from the stack */
    int pop()
    {
        if(tos < 0)
        {
            System.out.println("Stack underflow..!!");
            return 0;

        }
        else
        {
            return stack[tos--];
        }
    }
}

class This_One
{
    public static void main(String args[])
    {
	
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        
        /* push some numbers onto the stack */
        for(int i=0; i<10; i++)
        {
            mystack1.push(i);
        }
        for(int j=10; j<20; j++)
        {
            mystack2.push(j);
        }
        
        /* pop those numbers off the stack */
        System.out.println("Stack in mystack1 :");
        for(int i=0; i<10; i++)
        {
            System.out.println(mystack1.pop());
        }
        
        System.out.println("Stack in mystack2 :");
        for(int j=10; j<20; j++)
        {
            System.out.println(mystack2.pop());
        }
		
    }
}