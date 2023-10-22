// 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
package knowledge.huiShuo;
import java.util.*;
public class A_combine {
    /*          【回溯三部曲】
    void backtracking(参数) {     1. 确定参数
        if (终止条件) {             2. 确定终止条件
            存放结果;
            return;
        }

        for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）) {  3. 单层逻辑
            处理节点;
            backtracking(路径，选择列表); // 递归
            回溯，撤销处理结果
            }
    }
    */
    public static void main(String[] a){
        A_combine c =new A_combine();
        c.combine(4, 2);
    }

    List<List<Integer>> res = new ArrayList<>(); // 存结果， 列表存储
    LinkedList<Integer> path = new LinkedList<>(); // 存每个 k 数组，链表存储
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n, k, 1);
        return res;
    }

    private void backTracking(int n, int k, int startIndex){
        // 终止条件  
        if(path.size() == k){ // path大小符合 k 的值
            res.add(new ArrayList<>(path));
            return;
        }
        // 单层逻辑
        for (int i = startIndex; i <= n; i++) { // 本层：自左到右
            path.add(i); // 入列
            backTracking(n, k, i + 1); // 下层：自上而下
            path.removeLast(); // 出列
        }
    }
}
