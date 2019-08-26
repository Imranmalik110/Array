import java.lang.String;
import java.util.Scanner;
class Stack
{
    int stack[]=new int[10];
    int tos;
    /* Initilization of top of stack */
    Stack()
    {
        tos=-1;
    }
    /* Insert the Element in Stack */
    void Push(int item)
    {
        if(tos==9)
        {
            System.out.println("Stack is Full !!!");
            return 0;
        }
        else
        {
            stack[++tos]=item;
        }
    }
    /* Pop the element in Stack */
    void Pop()
    {
        if(tos<0)
        {
            System.out.println("Stack is Empty !!");
            return 0;
        }
        else
        {
            return stack[tos--];
        }
    }
}
    class Stack_Pro
    {
        public static void main(String args[])
        {
            Stack obj1=new Stack();
            Stack obj2=new Stack();
            for(int i=0;i<10;i++)
            {
                obj1.Push(i);
            }
            for(int j=10;j<20;j++)
            {
                obj2.Push(j);
            }
            System.out.println("STACK 1 : ");
            for(int i=0;i<10;i++)
            {
                System.out.println(obj1.Pop());
            }
            System.out.println("STACK 2: ");
            for(int j=10;j<20;j++)
            {
                System.out.println(obj2.Pop());
            }
        }
    }
