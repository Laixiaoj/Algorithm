// 用队列实现栈
package knowledge.Stack_Queue;
import java.util.LinkedList;
import java.util.Queue;

public class A_MyStack {
    // 定义队列
    Queue<Integer> queue;
    public A_MyStack() {
        queue = new LinkedList<>(); // LinkedList继承了Deque的接口
    }

    // 入栈
    public void push(int x) {
        // 入队
        queue.offer(x);
        int size = queue.size();
        while(size > 1){
            queue.offer(queue.poll()); // 将新元素移到队首
            size--;
        }
    }

    // 出栈
    public int pop() {
        // 出队
        return queue.poll();
    }

    public int top() {
        // 队头
        return queue.peek();

    }

    // 判断是否空
    public boolean empty() {
        return queue.isEmpty();
    }
}
