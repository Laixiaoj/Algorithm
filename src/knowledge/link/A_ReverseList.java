package knowledge.link;

// 反转链表
public class A_ReverseList {

    public static ListNode reverseList(ListNode head){
        ListNode cur = head; // 当前节点
        ListNode pre = null; // 前驱节点
        ListNode temp = null;
        while(cur != null){
            temp = cur.next; // 先暂存下一个节点
            cur.next = pre; // 步骤1：改头
            pre = cur; // 步骤2：改尾
            cur = temp; // 步骤3：遍历
        }
        return pre;
    }

    public static void main (String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head = reverseList(head);

        ListNode cur = head;
        while(cur != null){
            System.out.print(cur.val);
            System.out.print("->");
            cur = cur.next;
        }
        System.out.print("null");


    }

}
