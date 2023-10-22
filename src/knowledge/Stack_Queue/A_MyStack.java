// �ö���ʵ��ջ
package knowledge.Stack_Queue;
import java.util.LinkedList;
import java.util.Queue;

public class A_MyStack {
    // �������
    Queue<Integer> queue;
    public A_MyStack() {
        queue = new LinkedList<>(); // LinkedList�̳���Deque�Ľӿ�
    }

    // ��ջ
    public void push(int x) {
        // ���
        queue.offer(x);
        int size = queue.size();
        while(size > 1){
            queue.offer(queue.poll()); // ����Ԫ���Ƶ�����
            size--;
        }
    }

    // ��ջ
    public int pop() {
        // ����
        return queue.poll();
    }

    public int top() {
        // ��ͷ
        return queue.peek();

    }

    // �ж��Ƿ��
    public boolean empty() {
        return queue.isEmpty();
    }
}
