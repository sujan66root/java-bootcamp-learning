import java.util.Stack;

//Leetcode 155. Min Stack
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

//    initializing the stack values
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }


//    Push element val onto stack.
    public void push(int val) {
        mainStack.push(val);
        // Update minStack with the current minimum
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    public int top() {
       return mainStack.peek();

    }

    public int getMin() {
        return minStack.peek();
    }
}
