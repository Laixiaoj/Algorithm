// ʹ��ջʵ�ֶ��еĹ���

package Stack_Queue;
import java.util.Stack;

public class A_MyQueue {
    // ��������ջ
    Stack<Integer> stackIn; // ���
    Stack<Integer> stackOut;// ����

    // ��ʼ��
    public A_MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    // ���   ��ջ
    public void push(int x) {
        stackIn.push(x);
    }

    // ����   ��ջ
    public int pop() {
        // ���ж�stackOut�Ƿ�Ϊ��
        fillStackOut();
        return stackOut.pop();
    }

    // ��ͷԪ��   ջ��Ԫ��
    public int peek() {
        // ���ж�stackOut�Ƿ�Ϊ��
        fillStackOut();
        return stackOut.peek();
    }

    // ���ж�
    public boolean empty() {
        return stackOut.isEmpty() && stackIn.isEmpty() && true;
    }

    // stackIn -> stackOut
    public void fillStackOut(){
        if(!stackOut.isEmpty()) {
            return ; // ��Ϊ���˳�
        }

        while(!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());  // ��ջ
        }
    }
}
