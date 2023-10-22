// 求树最小深度  【迭代法】
package knowledge.doubleTreeNode;

import java.util.*;

public class minDepthTree {
    // 方法：迭代法：队列
    public int minDepth2(TreeNode root) {
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
                if(temp.left ==  null && temp.right == null) return depth; // 找到叶子节点
                if(temp.left != null) que.offer(temp.left); // 左
                if(temp.right != null) que.offer(temp.right); // 右
            }
        }
        return depth;
    }
}
