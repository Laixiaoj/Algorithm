// �����ཻ : ���������������ͷ�ڵ� headA �� headB �������ҳ������������������ཻ����ʼ�ڵ㡣
package knowledge.link;

public class getInterNodeLink {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int LenA = 0;
        int LenB = 0;

        // ������A����
        while(curA != null){
            LenA++;
            curA = curA.next;
        }

        // ������B����
        while(curB != null){
            LenB ++;
            curB = curB.next;
        }

        curA = headA;
        curB = headB;

        // Ĭ�ϰ�����A��Ϊ�����
        if(LenB > LenA){
            int tempLen = LenB;
            LenB = LenA;
            LenA = tempLen;
            ListNode tempNode = curA;
            curA = curB;
            curB = tempNode;
        }

        // �ҵ���ͬ�ƶ��Ľڵ�
        while(LenB < LenA){
            LenB ++;
            curA = curA.next;
        }

        // ����
        while(curA != null){
            // ע���жϵ��ǡ�ָ�롿�������ǽڵ�ֵcurA.val
            if(curA == curB) return curA;  // �ҵ�����
            curA = curA.next;
            curB = curB.next;

        }
        return null;
    }
}
