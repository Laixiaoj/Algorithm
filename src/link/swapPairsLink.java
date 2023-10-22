package link;

import link.ListNode;

// 两两交换链表中的节点
public class swapPairsLink {
    public ListNode swapPairs(ListNode head) {
        ListNode virHead = new ListNode(0); // 虚头节点
        virHead.next = head;  // 链接头节点
        ListNode cur = virHead; // 动态遍历节点
        ListNode temp = null; // 暂存交换节点的下一个节点
        ListNode firstNode = null; // 交换节点的第一个
        ListNode secondNode = null; // 交换节点的第二个

        while(cur.next != null && cur.next.next != null){
            temp = cur.next.next.next;
            firstNode = cur.next;
            secondNode = cur.next.next;
            cur.next = secondNode; // 步骤1
            secondNode.next = firstNode; // 步骤2
            firstNode.next = temp; // 步骤3
            cur = firstNode;
        }

        return virHead.next;
    }
}
