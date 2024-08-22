public class Node {
    int data;
    Node next;

    public Node(int x) {
        data = x;
        next = null;
    }

    public static Node insertNode(Node head, int value) {
//        1, 2 === newNode = 2, head = 1

        Node newNode = new Node(value);
        if (head == null || head.data >= value) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
//            current = 1
            while (current.next != null && current.next.data < value) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        return head;
    }

    public static void displayList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
