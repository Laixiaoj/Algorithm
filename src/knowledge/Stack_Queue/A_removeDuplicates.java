// ɾ���ַ����е����������ظ���   ��ʹ�� ջ �����
package knowledge.Stack_Queue;
import java.util.*;

public class A_removeDuplicates {
    public static String removeDuplicates(String s){
        // ArrayDeque�̳���Deque�Ľӿڣ���Deque�̳�Queue�Ľӿڣ�����ʹ������Ϊ��ջ
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(stack.isEmpty() || ch != stack.peek()){
                stack.push(ch); // �����ظ����ַ���ջ
            }else{
                stack.pop(); // �ظ����ַ���ջ
            }
        }
        String res = "";  // ���
        while (!stack.isEmpty()){
            res = stack.pop() + res;  // ջ�����ȳ�����������ƴ��
        }

        return res;
    }
}
