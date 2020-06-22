class Stack{
    int top; 
    int MAX=1000; //globally declaring the top element of stack
    int a[]= new int[MAX];

    boolean isEmpty()
    {
        return true;
    }

    Stack()
    {
        top=-1;

    }

    

    boolean push(int n)
     {  
        if(top>=MAX-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }

        else
        {
            a[++top]=n;
            System.out.println(n+" ->Pushed into Stack");
            return true;
        }

     }

public int pop()
{
    if(top<0)
    {
        System.out.println("Stack Underflow");
        return 0;
    }

    else{
        int n= a[top--];
        return n;
    }
}


}    


public class StackAlgorithm{

 public static void main(String []args){
    System.out.println("Hello World");
    
    Stack s= new Stack();
    s.push(6);
    s.push(7);
    s.push(8);

    System.out.println(s.pop()+" -> Popped from stack");

 }
}