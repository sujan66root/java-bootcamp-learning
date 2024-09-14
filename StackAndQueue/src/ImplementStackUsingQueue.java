import java.util.LinkedList;
import java.util.Queue;

// Leetcode 225. Implement Stack Using Queues;
public class ImplementStackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    public ImplementStackUsingQueue() {
    }

    // Push element onto stack
    public void push(int x) {
        q.offer(x);
        // Rotate the queue to bring the new element to the front (top of stack)
        for (int i = 1; i < q.size(); i++) {
            q.offer(q.poll());
        }
    }

    // Removes and returns the element on top of the stack
    public int pop() {
        return q.poll();
    }

    //    get the top element
    public int top() {
        return q.peek();
    }

    // Returns whether the stack is empty
    public boolean empty() {
        return q.isEmpty();
    }
}
