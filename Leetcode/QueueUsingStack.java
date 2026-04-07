import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x){
        s1.push(x);
    }

    public int pop(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front element: " + q.peek());

        System.out.println("Removed: " + q.pop());
        System.out.println("Removed: " + q.pop());

        q.push(40);

        System.out.println("Front element: " + q.peek());
    }
}