// 删除字符串中的所有相邻重复项   【使用 栈 解决】
package knowledge.Stack_Queue;
import java.util.*;

public class A_removeDuplicates {
    public static String removeDuplicates(String s){
        // ArrayDeque继承了Deque的接口，而Deque继承Queue的接口，可以使用其作为堆栈
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(stack.isEmpty() || ch != stack.peek()){
                stack.push(ch); // 将不重复的字符入栈
            }else{
                stack.pop(); // 重复的字符出栈
            }
        }
        String res = "";  // 结果
        while (!stack.isEmpty()){
            res = stack.pop() + res;  // 栈后入先出，采用逆序拼接
        }

        return res;
    }
}
