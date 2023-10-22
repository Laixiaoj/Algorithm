// 逆波兰表达式求值  【使用 堆栈 解决】
package Stack_Queue;

import java.util.*;

public class evalRPN {
    public static int evalRPN(String[] tokens){

        // 使用Deque作为 堆栈
        Deque<Integer> deque = new ArrayDeque<>();

        // 数字入栈， + - * / 入栈的是两数运算后的结果
        for (String s : tokens) {
            if("+".equals(s)){
                deque.push( deque.poll() + deque.poll() );
            }
            else if("-".equals(s)){
                deque.push( -deque.poll() + deque.poll() ); // - 需要注意被减数
            }
            else if("*".equals(s)){
                deque.push( deque.poll() * deque.poll() );
            }
            else if("/".equals(s)){
                int temp1 = deque.poll(); // 除数
                int temp2 = deque.pop(); // 被除数
                deque.push( temp2 / temp1 ); // / 需要注意被除数
            }
            else{ // 数字直接入栈
                deque.push(Integer.valueOf(s)); // 字符串转 Integer
            }
        }
        // 最后剩余的值即为结果，出栈
        return deque.poll();
    }
}
