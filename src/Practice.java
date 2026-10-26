public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode('x');
        ListNode other = new ListNode('m');
        
        head.next = other;

        head.next.next = new ListNode('v');
        head.next.next.next = new ListNode('e');
        head.next.next.next.next = new ListNode('m');

        System.out.println(head.data); //x
        System.out.println(head.next); //m
        System.out.println(head.next.data); //
        System.out.println(head.next.next.data);

        printList(head);
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    //count how many occurences of letter in the list
    public static int countLetter(ListNode head, char letter) {
        int count = 0;
        ListNode current = head;
        while(current != null) {
            if(current.data == letter) {
                count++;
            }
        }
        return count;
    }
}
