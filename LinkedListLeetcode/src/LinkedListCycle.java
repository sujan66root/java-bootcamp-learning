// Leetcode  141. Linked List Cycle
public class LinkedListCycle {
    public static void main(String[] args) {
//        assign some values to head may be 1,2,3,4,5 and pos 2 where 2 is the tail
//        pointing to position of values in head
        Node head;
//        System.out.println(findLinkedListCycle(head));

    }

    public static boolean findLinkedListCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (head.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //    bonus to find to the length of above found linked list cycle
    public static int findLengthLinkedListCycle(Node head) {
        Node fast = head;
        Node slow = head;
        int counter = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                Node temp = slow;
                do {
                    counter++;
                    temp = temp.next;
                } while (temp != slow);
            }
        }
        return counter;
    }
}
