// �沨�����ʽ��ֵ  ��ʹ�� ��ջ �����
package Stack_Queue;

import java.util.*;

public class evalRPN {
    public static int evalRPN(String[] tokens){

        // ʹ��Deque��Ϊ ��ջ
        Deque<Integer> deque = new ArrayDeque<>();

        // ������ջ�� + - * / ��ջ�������������Ľ��
        for (String s : tokens) {
            if("+".equals(s)){
                deque.push( deque.poll() + deque.poll() );
            }
            else if("-".equals(s)){
                deque.push( -deque.poll() + deque.poll() ); // - ��Ҫע�ⱻ����
            }
            else if("*".equals(s)){
                deque.push( deque.poll() * deque.poll() );
            }
            else if("/".equals(s)){
                int temp1 = deque.poll(); // ����
                int temp2 = deque.pop(); // ������
                deque.push( temp2 / temp1 ); // / ��Ҫע�ⱻ����
            }
            else{ // ����ֱ����ջ
                deque.push(Integer.valueOf(s)); // �ַ���ת Integer
            }
        }
        // ���ʣ���ֵ��Ϊ�������ջ
        return deque.poll();
    }
}
