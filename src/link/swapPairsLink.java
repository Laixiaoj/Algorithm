package link;

import link.ListNode;

// �������������еĽڵ�
public class swapPairsLink {
    public ListNode swapPairs(ListNode head) {
        ListNode virHead = new ListNode(0); // ��ͷ�ڵ�
        virHead.next = head;  // ����ͷ�ڵ�
        ListNode cur = virHead; // ��̬�����ڵ�
        ListNode temp = null; // �ݴ潻���ڵ����һ���ڵ�
        ListNode firstNode = null; // �����ڵ�ĵ�һ��
        ListNode secondNode = null; // �����ڵ�ĵڶ���

        while(cur.next != null && cur.next.next != null){
            temp = cur.next.next.next;
            firstNode = cur.next;
            secondNode = cur.next.next;
            cur.next = secondNode; // ����1
            secondNode.next = firstNode; // ����2
            firstNode.next = temp; // ����3
            cur = firstNode;
        }

        return virHead.next;
    }
}
