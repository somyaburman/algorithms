//package .vscode;
import java.util.LinkedList;
//import java.util.Stack;
import java.util.Queue;

public class QueueDS {
    public static void main(String []args)
    {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<5; i++)
        q.add(i);

        System.out.println("Elements of Queue : "+q);

        int delElem = q.remove();
        System.out.println("Removed Element :"+delElem);

        System.out.println(q);

        int head=q.peek();
        System.out.println("Top element of Queue : "+head);

        int size=q.size();
        System.out.println("Size of Queue :"+size);
    

    }
    
}