package knowledge.link;

public class A_designLink {

    public static void main(String[] args){
        A_designLink Link = new A_designLink();
        Link.addIndex(0, 1);
        Link.addIndex(2, 3);
        Link.addIndex(3, 4);
        Link.addIndex(1, 2);
        Link.deleteIndex(1);
        System.out.println(Link.get(1));
    }

    int size; // ͳ�ƽڵ�����
    ListNode head; // ��ͷ�ڵ�

    // ��ʼ��
    public A_designLink(){
        this.size = 0;
        this.head = new ListNode(-1);
    }

    // ��ȡ�ض��±�ڵ�
    public int get(int index){
        if(index < 0 || index >= size) return -1;
        ListNode pre = head;
        for (int i = 0; i <= index; i++) {
            pre = pre.next; // �ҵ� index �ڵ�
        }
        return pre.val;
    }

    //��ӽڵ�
    public void addIndex(int index, int val){
        if(index > size) return; // ���������ȣ���Ӳ���
        if(index < 0) index = 0; // Ĭ��С�� 0 λ��Ϊ 0
        size++ ; // ����µĽڵ�
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next; // �ҵ� index ��ǰ���ڵ�
        }
        ListNode newNode = new ListNode(val); // ������ڵ�
        newNode.next = pre.next; // �ȸ�ͷ
         pre.next = newNode; // �ٸ�β
    }

    // ɾ���ڵ�
    public void deleteIndex(int index){
        if(index < 0 || index >= size) return;
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size --; // ȥ��һ�����
    }

    // ���β���
    public void addTail(int val){
        ListNode tailNode = new ListNode(val);
        addIndex(size, val);
    }
}
