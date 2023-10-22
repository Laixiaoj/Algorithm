// 求树最大深度  【递归法  +  迭代法】
package knowledge.doubleTreeNode;

import java.util.*;

public class A_maxDepthTree {
    // 方法一：后序遍历
    public int maxDepth(TreeNode root) {
        // 终止条件
        if(root == null) return 0;
        // 单层逻辑
        int leftDepth = maxDepth(root.left); // 左
        int rightDepth = maxDepth(root.right); // 右
        int depth = Math.max(leftDepth, rightDepth) + 1; // 中
        // 返回值
        return depth;
    }

    // 方法二：迭代法  队列
    public int maxDepth2(TreeNode root) {
        if(root == null) return 0;
        // 定义一个队列
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root); // 入队
        int depth = 0;

        while (!que.isEmpty()){ // 自上而下
            int len = que.size();
            depth++; // 深度累加
            while (len -- > 0){ // 自左到右
                TreeNode temp = que.poll(); // 出队
                if(temp.left != null) que.offer(temp.left); // 左
                if(temp.right != null) que.offer(temp.right); // 右
            }
        }
      return depth;
    }
}


