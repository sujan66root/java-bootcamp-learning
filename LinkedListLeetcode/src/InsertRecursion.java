public class InsertRecursion{
    public static void main(String[] args) {
        Node firstNode = new Node(1);
        firstNode = insertUsingRecursion(firstNode, 3, 1);
//        Printing List
        Node current = firstNode;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");//end of list
    }
    public static Node insertUsingRecursion(Node head, int value, int index){
//        base condition
        if(index == 0){
            Node current = new Node(value);
            current.next = head;
            return current;
        }
        head.next = insertUsingRecursion(head.next, value, index-1);
        return head;
    }
}