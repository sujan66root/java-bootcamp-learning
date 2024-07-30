import java.util.LinkedList;

//Merge two sorted list
public class MergeSortedList {
    public static void main(String[] args) {
        Node list1 = null; Node list2 = null;
        list1 = Node.insertNode(list1, 1);
        list1 = Node.insertNode(list1, 2);
        list1 = Node.insertNode(list1, 3);
        list2 = Node.insertNode(list2, 1);
        list2 = Node.insertNode(list2, 4);
        list2 = Node.insertNode(list2, 5);
        Node.displayList(list1);
        Node.displayList(list2);
        Node mergedList = (MergeTwoSortedList(list1,list2));
        Node.displayList(mergedList);

    }
    public static Node MergeTwoSortedList(Node l1, Node l2){
        Node dummy = new Node(Integer.MIN_VALUE);
        Node current = dummy;
        while(l1 != null && l2 != null){
            if(l1.data<=l2.data){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 == null){
            current.next = l2;
        }
        if(l2 == null){
            current.next = l1;
        }
        return dummy.next;
    }
}

