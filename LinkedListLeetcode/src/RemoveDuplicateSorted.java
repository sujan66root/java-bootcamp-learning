//Leetcode 83: Remove duplicate from sorted list
public class RemoveDuplicateSorted {
    public static void main(String[] args) {
        Node head = null;
        head = Node.insertNode(head, 1);
        head = Node.insertNode(head, 1);
        head = Node.insertNode(head, 1);
        head = Node.insertNode(head, 1);
        head = Node.insertNode(head, 1);
        Node.displayList(head);
        head = removeDuplicateFromSortedList(head);
        Node.displayList(head);
    }
    public static Node removeDuplicateFromSortedList(Node head){
        Node current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
}
