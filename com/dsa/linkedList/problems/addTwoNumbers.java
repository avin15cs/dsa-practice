package linkedList.problems;

import linkedList.ListNode;


public class addTwoNumbers
{


    public static void main(String[] args) {


        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);


        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);


        ListNode l3 = addTwoNumbers(l1,l2);

        System.out.println(l3);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode(0);
        ListNode node = ans;
        int rem = 0;

        while(l1!=null || l2!=null || rem !=0 ) {

            int sum = 0;

            if(l1!=null) {
                sum+=l1.val;
                l1=l1.next;
            }

            if(l2 != null) {
                sum+=l2.val;
                l2=l2.next;
            }

            sum += rem;
            node.next = new ListNode(sum%10);
            node = node.next;
            rem = sum/10;
        }

        return ans.next;
    }
}