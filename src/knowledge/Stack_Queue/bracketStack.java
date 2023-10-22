// 有效的括号  【使用 栈 解决】

package knowledge.Stack_Queue;
import java.util.*;

public class bracketStack {
    public static boolean isValid(String s){
        // { [ ( 对应一边入栈，相同则出栈
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')  stack.push(')');
            else if(s.charAt(i) == '{') stack.push('}');
            else if(s.charAt(i) == '[') stack.push(']');
            else if(stack.isEmpty() || s.charAt(i) != stack.peek()) return false;
            else stack.pop();
        }
        // 最终栈为空即为有效
        return stack.isEmpty();
    }

}
