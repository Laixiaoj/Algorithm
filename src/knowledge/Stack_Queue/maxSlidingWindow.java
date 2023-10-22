//  滑动窗口最大值  【自定义 队列 解决】
package knowledge.Stack_Queue;

import java.util.*;

class myQueue{

    // 队列
    Deque<Integer> deque = new ArrayDeque<>();
    // 出队
    public void poll(int val){
        if(!deque.isEmpty() && val == deque.peek())
            deque.poll();
    }
    // 判断入队
    public void add(int val){
        while(!deque.isEmpty() && val > deque.getLast())
            deque.removeLast(); // 移除队尾元素
        deque.add(val); // 最大元素保持在对头
    }

    // 队头
    public int peek(){
        return deque.peek();
    }
}


public class maxSlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k){
        if(nums.length == 1) return nums;
        // 滑动窗口
        myQueue queue = new myQueue();
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]); // 初始化前 k 个
        }

        // 结果数组
        int[] res = new int[nums.length - k + 1];
        int index = 0; // 窗口下标
        res[index++] = queue.peek(); // 初始化

        for (int i = k; i < nums.length; i++) {
            queue.poll(nums[i - k]); // 如果窗口移除的元素是对头元素，则弹出对头
            queue.add(nums[i]); // 判断新的元素是否为最大
            res[index++] = queue.peek();
        }
        // 返回结果
        return res;
    }
}
