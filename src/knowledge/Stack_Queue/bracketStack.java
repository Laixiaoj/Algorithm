// ��Ч������  ��ʹ�� ջ �����

package knowledge.Stack_Queue;
import java.util.*;

public class bracketStack {
    public static boolean isValid(String s){
        // { [ ( ��Ӧһ����ջ����ͬ���ջ
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')  stack.push(')');
            else if(s.charAt(i) == '{') stack.push('}');
            else if(s.charAt(i) == '[') stack.push(']');
            else if(stack.isEmpty() || s.charAt(i) != stack.peek()) return false;
            else stack.pop();
        }
        // ����ջΪ�ռ�Ϊ��Ч
        return stack.isEmpty();
    }

}
