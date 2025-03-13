import java.util.Stack;

public class Sample31 {

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        
       {
            
            int topElement = stack.peek();
            System.out.println("Top element: " + topElement);

           
            int bottomElement = stack.firstElement();
            System.out.println("Bottom element: " + bottomElement);
        } 
        {
            System.out.println("The stack is empty.");
        }
    }
}
