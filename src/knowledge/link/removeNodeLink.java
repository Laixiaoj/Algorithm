package knowledge.link;

// ɾ������ĵ����� N �����  ��˫ָ�롿
public class removeNodeLink {
    // ����һ��˫ָ��
    public ListNode Slotion(ListNode head, int n){
        ListNode dumpNode = new ListNode(-1);
        dumpNode.next = head;
        ListNode fast = dumpNode;
        ListNode slow = dumpNode;

        // fast ֻ��Ҫ�� slow ���� n ������ָ��ڵ�n
        for (int i = 0; i < n; i++)
            fast = fast.next;

        while (fast.next != null) { // fast���꣬slow�����ɾ����ǰ�ýڵ�
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next; // ɾ��
        return dumpNode.next;
    }

    // �������������ڵ�ɾ��
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = head;
        int size = 0; // ������
        while(dummyNode != null){ // ͳ��������
            size ++;
            dummyNode = dummyNode.next;
        }

        if(size == 0) return null;

        dummyNode = new ListNode(-1); // ��ͷ�ڵ㣬�����Ƴ�ͷ�ڵ�
        dummyNode.next = head;
        ListNode pre = dummyNode; // ǰ�ýڵ�

        for(int i = 0; i < size - n; i++) // �ҵ�ǰ�ýڵ�
            pre = pre.next;

        pre.next = pre.next.next; // ɾ��

        return dummyNode.next;
    }


}
