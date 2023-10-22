// 找树左下角的值: 找出该二叉树的 最底层 最左边 节点的值。
package knowledge.doubleTreeNode;
import java.util.*;

public class A_findBottomLeftValue {
    // 迭代法找 借助 queue
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return 0;
        int res = 0;
        // 定义一个辅助队列
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root); // 入队

        while(!que.isEmpty()){ // 自上而下

            int len = que.size();

            for(int i = 0; i < len; i++){ // 自左到右
                TreeNode temp = que.poll(); // 出队
                if(i == 0) res = temp.val; // 保存最左节点的res
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);
            }
        }
        return res;
    }
}
