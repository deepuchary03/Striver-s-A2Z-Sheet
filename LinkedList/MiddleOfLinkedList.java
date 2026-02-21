package LinkedList;
// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.

public class MiddleOfLinkedList {
    public static Node middleOfLL(Node head){
        if(head==null||head.next==null) return head;
        Node fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        BuildLL b=new BuildLL();
        Node head=b.arrayToLinkedList( arr);
        System.out.println(middleOfLL(head).data);
    }
}
