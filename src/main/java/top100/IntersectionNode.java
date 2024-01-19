package top100;

import java.util.ArrayList;

/**
 * <a href="https://leetcode.cn/problems/intersection-of-two-linked-lists/description/?envType=study-plan-v2&envId=top-100-liked">...</a>
 */
public class IntersectionNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        ListNode temp = headA;
        while (temp != null) {
            arrayList.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if(arrayList.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
