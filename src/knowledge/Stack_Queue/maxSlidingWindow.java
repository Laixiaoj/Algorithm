//  �����������ֵ  ���Զ��� ���� �����
package knowledge.Stack_Queue;

import java.util.*;

class myQueue{

    // ����
    Deque<Integer> deque = new ArrayDeque<>();
    // ����
    public void poll(int val){
        if(!deque.isEmpty() && val == deque.peek())
            deque.poll();
    }
    // �ж����
    public void add(int val){
        while(!deque.isEmpty() && val > deque.getLast())
            deque.removeLast(); // �Ƴ���βԪ��
        deque.add(val); // ���Ԫ�ر����ڶ�ͷ
    }

    // ��ͷ
    public int peek(){
        return deque.peek();
    }
}


public class maxSlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k){
        if(nums.length == 1) return nums;
        // ��������
        myQueue queue = new myQueue();
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]); // ��ʼ��ǰ k ��
        }

        // �������
        int[] res = new int[nums.length - k + 1];
        int index = 0; // �����±�
        res[index++] = queue.peek(); // ��ʼ��

        for (int i = k; i < nums.length; i++) {
            queue.poll(nums[i - k]); // ��������Ƴ���Ԫ���Ƕ�ͷԪ�أ��򵯳���ͷ
            queue.add(nums[i]); // �ж��µ�Ԫ���Ƿ�Ϊ���
            res[index++] = queue.peek();
        }
        // ���ؽ��
        return res;
    }
}
