package knowledge.link;

// ��ת����
public class A_ReverseList {

    public static ListNode reverseList(ListNode head){
        ListNode cur = head; // ��ǰ�ڵ�
        ListNode pre = null; // ǰ���ڵ�
        ListNode temp = null;
        while(cur != null){
            temp = cur.next; // ���ݴ���һ���ڵ�
            cur.next = pre; // ����1����ͷ
            pre = cur; // ����2����β
            cur = temp; // ����3������
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
