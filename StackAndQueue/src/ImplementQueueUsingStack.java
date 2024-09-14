import java.util.Stack;

// Leetcode 232. Implement Queue using Stacks
public class ImplementQueueUsingStack {
    //    make two stack
    Stack<Integer> firstStack = new Stack<>();
    Stack<Integer> secondStack = new Stack<>();

    public ImplementQueueUsingStack() {
    }

    // perform push operation in any of the stack
    public void push(int x) {
        firstStack.push(x);
    }

    //    check if second is empty and add popped element from first to the second so, it looks like queue now
    public int pop() {
        if (secondStack.isEmpty()) {
            // Transfer all elements from inputStack to outputStack
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
        return secondStack.pop();
    }

    //    peek the element from second as it is a queue now
    public int peek() {
        if (secondStack.isEmpty()) {
            // Transfer all elements from inputStack to outputStack if outputStack is empty
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
        return secondStack.peek();  // Peek the front element
    }

    //    check if the queue is empty
    public boolean empty() {
        return secondStack.isEmpty() && firstStack.isEmpty();
    }
}
