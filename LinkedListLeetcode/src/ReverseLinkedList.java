public class ReverseLinkedList {
    public static void main(String[] args) {
        Node list1 = null;
        list1 = Node.insertNode(list1, 4);
        list1 = Node.insertNode(list1, 5);
        list1 = Node.insertNode(list1, 6);
        list1 = Node.insertNode(list1, 3);
        System.out.println("Original List:");
        Node.displayList(list1);

        Node reverseList = reverseList(list1);

        System.out.println("Reversed List:");
        Node.displayList(reverseList);
    }

    public static Node reverseList(Node head) {
//        head : 1-2-3-4-5-tail =>
//        prev =null - present 1-2-3-4-5
//        output : tail-1-2-3-4-5-head
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
//    Another approach using recursion
//    public static Node reverseListUsingRecursion(Node current){
//        if(current == tail){
//            current = tail;
//            return;
//        }
//        reverseListUsingRecursion(current.next);
//        tail.next = current;
//        tail = current;
//        tail.next = null;
//    }
}
