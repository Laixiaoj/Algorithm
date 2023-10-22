package knowledge.link;

// 删除链表的倒数第 N 个结点  【双指针】
public class removeNodeLink {
    // 方法一：双指针
    public ListNode Slotion(ListNode head, int n){
        ListNode dumpNode = new ListNode(-1);
        dumpNode.next = head;
        ListNode fast = dumpNode;
        ListNode slow = dumpNode;

        // fast 只需要比 slow 先走 n 步，即指向节点n
        for (int i = 0; i < n; i++)
            fast = fast.next;

        while (fast.next != null) { // fast走完，slow到达待删除的前置节点
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next; // 删除
        return dumpNode.next;
    }

    // 方法二：遍历节点删除
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = head;
        int size = 0; // 链表长度
        while(dummyNode != null){ // 统计链表长度
            size ++;
            dummyNode = dummyNode.next;
        }

        if(size == 0) return null;

        dummyNode = new ListNode(-1); // 虚头节点，方便移除头节点
        dummyNode.next = head;
        ListNode pre = dummyNode; // 前置节点

        for(int i = 0; i < size - n; i++) // 找到前置节点
            pre = pre.next;

        pre.next = pre.next.next; // 删除

        return dummyNode.next;
    }


}
