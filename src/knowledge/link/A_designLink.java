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

    int size; // 统计节点数量
    ListNode head; // 虚头节点

    // 初始化
    public A_designLink(){
        this.size = 0;
        this.head = new ListNode(-1);
    }

    // 获取特定下标节点
    public int get(int index){
        if(index < 0 || index >= size) return -1;
        ListNode pre = head;
        for (int i = 0; i <= index; i++) {
            pre = pre.next; // 找到 index 节点
        }
        return pre.val;
    }

    //添加节点
    public void addIndex(int index, int val){
        if(index > size) return; // 超过链表长度，添加不了
        if(index < 0) index = 0; // 默认小于 0 位置为 0
        size++ ; // 添加新的节点
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next; // 找到 index 的前驱节点
        }
        ListNode newNode = new ListNode(val); // 待插入节点
        newNode.next = pre.next; // 先改头
         pre.next = newNode; // 再改尾
    }

    // 删除节点
    public void deleteIndex(int index){
        if(index < 0 || index >= size) return;
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size --; // 去掉一个结点
    }

    // 添加尾结点
    public void addTail(int val){
        ListNode tailNode = new ListNode(val);
        addIndex(size, val);
    }
}
