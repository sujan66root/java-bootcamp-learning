//142. Linked List Cycle II
public class LinkedListCycle2 {
    public static void main(String[] args) {

    }
    public static Node findLinkedListCycleNode(Node head){
        Node fast = head;
        Node slow = head;
        while(fast !=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                Node pointer1 = head;
                Node pointer2 = slow;
                while (pointer2 != pointer1){
                    pointer1 = pointer1.next;
                    pointer2 = pointer2.next;
                }
                return pointer1;
            }
        }
        return null;
    }
}
