// 完全二叉树的节点个数：统计所有节点
package knowledge.doubleTreeNode;
import java.util.*;
public class countNodes {

    // 方法一：递归法：1、确定参数和返回值 2、终止条件 3、单层逻辑
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int leftNode = countNodes(root.left); // 左
        int rightNode = countNodes(root.right); // 右
        return leftNode + rightNode + 1; // 中

    }
     // 方法二：迭代法  队列
     public int countNodes1(TreeNode root) {
         if(root == null) return 0;
         // 定义一个队列
         Deque<TreeNode> que = new LinkedList<>();
         que.offer(root); // 入队
         int depth = 0;

         while (!que.isEmpty()){ // 自上而下
             int len = que.size();
             while (len -- > 0){ // 自左到右
                 TreeNode temp = que.poll(); // 出队
                 depth++; // 节点累加
                 if(temp.left != null) que.offer(temp.left); // 左
                 if(temp.right != null) que.offer(temp.right); // 右
             }
         }
       return depth;
     }
}
