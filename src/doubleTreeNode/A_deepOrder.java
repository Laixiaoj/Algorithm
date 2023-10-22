// 二叉树前中后序遍历（深度优先遍历）  【递归实现】
package doubleTreeNode;
import java.util.*;

public class A_deepOrder {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    // 递归查询：1、确定参数和返回值 2、确定终止条件 3、确定单层递归逻辑
    public void preorder(TreeNode cur, List<Integer> res){
        // 终止条件
        if(cur == null) return; // 当前节点是否为空
        //单层逻辑
        res.add(cur.val); // 中
        preorder(cur.left, res); // 左
        preorder(cur.right, res); // 右
    }


}
