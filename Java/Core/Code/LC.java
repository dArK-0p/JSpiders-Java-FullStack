public class LC {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        return null;
    }

    public static void printListNode(ListNode head) {
        for(ListNode t = head; t != null; t = t.next)
            System.out.print(t.val);
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,
            new ListNode(4,
                new ListNode(3,
                    null
        )));

        ListNode l2 = new ListNode(5,
            new ListNode(6,
                new ListNode(4,
                    null
        )));

        ListNode l3 = new ListNode(0, null);
        ListNode l4 = new ListNode(0, null);

        ListNode l5 = new ListNode(9,
            new ListNode(9,
                new ListNode(9,
                    new ListNode(9,
                        new ListNode(9,
                            new ListNode(9,
                                new ListNode(9,
                                null
        )))))));

        ListNode l6 = new ListNode(9,
            new ListNode(9,
                new ListNode(9,
                    new ListNode(9, 
                    null
        ))));

        System.out.println("T1: Ans: 708");
        printListNode(addTwoNumbers(l1, l2));

        System.out.println("T2: Ans: 0");
        printListNode(addTwoNumbers(l3, l4));

        System.out.println("T3: Ans: 89990001");
        printListNode(addTwoNumbers(l5, l6));

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}