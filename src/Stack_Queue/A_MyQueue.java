// 使用栈实现队列的功能

package Stack_Queue;
import java.util.Stack;

public class A_MyQueue {
    // 定义两个栈
    Stack<Integer> stackIn; // 入队
    Stack<Integer> stackOut;// 出队

    // 初始化
    public A_MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    // 入队   入栈
    public void push(int x) {
        stackIn.push(x);
    }

    // 出队   出栈
    public int pop() {
        // 先判断stackOut是否为空
        fillStackOut();
        return stackOut.pop();
    }

    // 对头元素   栈顶元素
    public int peek() {
        // 先判断stackOut是否为空
        fillStackOut();
        return stackOut.peek();
    }

    // 空判断
    public boolean empty() {
        return stackOut.isEmpty() && stackIn.isEmpty() && true;
    }

    // stackIn -> stackOut
    public void fillStackOut(){
        if(!stackOut.isEmpty()) {
            return ; // 不为空退出
        }

        while(!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());  // 入栈
        }
    }
}
