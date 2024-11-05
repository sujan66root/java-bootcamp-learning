//Leetcode 328 Medium Leetcode
//Input: head = [1,2,3,4,5]
//Output: [1,3,5,2,4]

public class OddEvenLinkedList {
    public Node oddEvenList(Node head) {
        // Edge case: if the  is empty or has only one node, return head
        if (head == null || head.next == null) {
            return head;
        }

        Node odd = head;          // Start with the first node (odd)
        Node even = head.next;    // Start with the second node (even)
        Node evenHead = even;     // Save the head of the even list

        while (even != null && even.next != null) {
            odd.next = even.next;     // Connect current odd node to the next odd node
            odd = odd.next;           // Move odd pointer forward
            even.next = odd.next;     // Connect current even node to the next even node
            even = even.next;         // Move even pointer forward
        }

        odd.next = evenHead; // Connect the end of the odd list to the head of the even list

        return head;
    }
}
