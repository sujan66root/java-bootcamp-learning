//Leetcode 876 Middle of the Linked List
//concept of fast and slow pointers again
//Logic is if fast reaches the end then slow is at the middle always.
//Fast is moving twice the speed of slow
public class MiddleLinkedList {
    public static Node findMiddleLinkedList(Node head){
        if(head == null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
