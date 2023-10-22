package doublePointer;

import link.ListNode;

// 循环链表是否存在环  【双指针】
public class CycleLink {
    // 快慢指针应用
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head; // 每次移动两个节点
        ListNode slow = head; // 每次移动一个节点
        while(fast != null && fast.next != null){// 由快指针移动遍历链表
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){ // 存在环，注意：判断的是节点，非节点值
                ListNode index1 = fast;
                ListNode index2 = head;
                // 同时移动直到相等，即为环入口pas
                while(index1 != index2){
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
