import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.add(1);
//        stack.push(2);
//        stack.push(3);
////        System.out.println(stack);
////        stack.pop();
////        System.out.println(stack);
////        stack.remove(0);
////        System.out.println(stack);
//        System.out.println(stack.peek());
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(4);
        System.out.println(myStack);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
//        myStack.pop();
        System.out.println(myStack);

    }
}