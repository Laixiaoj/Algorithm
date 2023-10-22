// 链表相交 : 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
package knowledge.link;

public class getInterNodeLink {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int LenA = 0;
        int LenB = 0;

        // 求链表A长度
        while(curA != null){
            LenA++;
            curA = curA.next;
        }

        // 求链表B长度
        while(curB != null){
            LenB ++;
            curB = curB.next;
        }

        curA = headA;
        curB = headB;

        // 默认把链表A视为最长链表
        if(LenB > LenA){
            int tempLen = LenB;
            LenB = LenA;
            LenA = tempLen;
            ListNode tempNode = curA;
            curA = curB;
            curB = tempNode;
        }

        // 找到共同移动的节点
        while(LenB < LenA){
            LenB ++;
            curA = curA.next;
        }

        // 遍历
        while(curA != null){
            // 注意判断的是【指针】，而不是节点值curA.val
            if(curA == curB) return curA;  // 找到交点
            curA = curA.next;
            curB = curB.next;

        }
        return null;
    }
}
