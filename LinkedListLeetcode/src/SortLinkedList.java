// Leetcode 148 Sort List
// the pattern:
// Use Merge Sort: find middle use fast slow, split two halves from middle, sort each half recursively, merge both sorted list

public class SortLinkedList {
    public static void main(String[] args) {
        Node list1 = null;
        list1 = Node.insertNode(list1, 4);
        list1 = Node.insertNode(list1, 1);
        list1 = Node.insertNode(list1, 6);
        list1 = Node.insertNode(list1, 2);
        System.out.println("Original List:");
        Node.displayList(list1);

        Node sortedList = sortList(list1);

        System.out.println("Sorted List:");
        Node.displayList(sortedList);

    }
    public static Node sortList(Node head){
        if (head == null || head.next == null){
            return head;
        }
// Finding middle from list : I have function which I had created for solving before problem
        Node mid = MiddleLinkedList.findMiddleLinkedList(head); //6
// split two halves
        Node left = head; // for now, left is 4,1,6,2
        Node right = mid.next; //  2 , ->
        mid.next = null; // 6-> null
//        sort each half recursively
        left = sortList(left);
        right = sortList(right);
//        merging two sorted linked list, I am just calling function i did earlier
        return MergeSortedList.MergeTwoSortedList(left, right);
    }
}
