package Other;// Catalan数：二叉树节点、左右括号匹配、成对买票、分割三角形、栈出顺序
// f(n) = f(0) * f(n - 1) + f(1) * f(n - 2) + ... + f(n - 2) * f(1) + f(n - 1) * f(0)
// 统计Catalan数

import java.util.ArrayList;
import java.util.List;

public class Catalan {
    public int Catalan(int n){
        if(n == 0)
            return 0;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1); // f(0) = 1;
        res.add(1); // f(1) = 1;
        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j <= i - 1; j++) {
                sum += res.get(j) * res.get(i - 1 - j);
            }
            res.add(sum);
        }
        return res.get(n);
    }

    // 左右括号匹配
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }

        // 执行深度优先遍历，搜索可能的结果
        dfs("", n, n, res);
        return res;
    }

    private void dfs(String curStr, int left, int right, List<String> res) {
        // 因为每一次尝试，都使用新的字符串变量，所以无需回溯
        // 在递归终止的时候，直接把它添加到结果集即可，注意与「力扣」第 46 题、第 39 题区分
        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }

        // 剪枝（如图，左括号可以使用的个数严格大于右括号可以使用的个数，才剪枝，注意这个细节）
        if (left > right) {
            return;
        }

        if (left > 0) {
            dfs(curStr + "(", left - 1, right, res);
        }

        if (right > 0) {
            dfs(curStr + ")", left, right - 1, res);
        }
    }


    public static void main(String[] agrs){
        Catalan t = new Catalan();
        List<String> l = t.generateParenthesis(3);
        System.out.println("n = 3时 总共有 " + t.Catalan(3) + " 种左右括号组合");
        System.out.println("结果：" + l.toString());

    }
}
