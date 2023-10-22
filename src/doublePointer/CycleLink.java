package doublePointer;

import link.ListNode;

// ѭ�������Ƿ���ڻ�  ��˫ָ�롿
public class CycleLink {
    // ����ָ��Ӧ��
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head; // ÿ���ƶ������ڵ�
        ListNode slow = head; // ÿ���ƶ�һ���ڵ�
        while(fast != null && fast.next != null){// �ɿ�ָ���ƶ���������
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){ // ���ڻ���ע�⣺�жϵ��ǽڵ㣬�ǽڵ�ֵ
                ListNode index1 = fast;
                ListNode index2 = head;
                // ͬʱ�ƶ�ֱ����ȣ���Ϊ�����pas
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
