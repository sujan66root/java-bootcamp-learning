public class DeleteMiddleLinkedList {
    public static Node deleteMiddleLinkedlist(Node head){
        if (head == null || head.next == null) {
            // If the list is empty or has only one node, return null
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast!=null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev!= null){
            prev.next = slow.next;
        }
        return head;
    }
}
