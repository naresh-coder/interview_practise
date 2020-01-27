package list;

public class RemoveNthNodeFromLast {


    public static void main(String[] args) {


      ListNode l = new ListNode(1);
      ListNode l1 = new ListNode(2);
      ListNode l2 = new ListNode(3);
      l.next = l1;
      l1.next = l2;

        ListNode listNode = removeNthNodeFromList(l, 2);

    }



    public  static  ListNode removeNthNodeFromList(ListNode head,int n){
        ListNode start = new ListNode(0);
        ListNode slow = start;
        ListNode fast = start;

        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }

    private static class ListNode {
        private  int val;
        ListNode next;

        ListNode(int x){
            this.val = x;
        }
    }
}
