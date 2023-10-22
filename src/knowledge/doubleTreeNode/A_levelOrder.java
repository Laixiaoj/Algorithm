// 二叉树的层次遍历（广度优先遍历） 【迭代法 队列实现】
package knowledge.doubleTreeNode;
import java.util.*;

public class A_levelOrder {
    // 定义一个动态 二维 Integer 列表 res
    public List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        QueueTravel(root);
        return res;
    }

    // 借助 队列 实现遍历：按层次自上而下，从左到右遍历
    public void QueueTravel(TreeNode root){

        if(root == null) return; // 终止条件
        // 定义队列
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root); // 根节点入队

        while(!que.isEmpty()){ // 遍历层：自上而下
            // 定义存 每层元素Integer 的列表
            List<Integer> item = new LinkedList<>();
            int len = que.size(); // que.size是动态大小

            while(len -- > 0){ // 遍历每层的节点：从左到右
                TreeNode tempNode = que.poll(); // 出队
                item.add(tempNode.val);
                // 左节点
                if(tempNode.left != null) que.offer(tempNode.left);
                // 右节点
                if(tempNode.right != null) que.offer(tempNode.right);
            }
            res.add(item); // 存 每层的节点元素
        }
    }
}
