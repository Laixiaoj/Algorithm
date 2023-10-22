// 二叉搜索树的最小绝对差
package knowledge.doubleTreeNode;

public class getMinimumDifference {
    int res = Integer.MAX_VALUE;
    TreeNode pre; // 当前节点的前一个节点

    public int getMinimumDifference(TreeNode root) {
        if(root == null) return 0; // 空树
        megetravel(root);
        return res;
    }

    // BST中序遍历结果为升序数组
    public void megetravel(TreeNode curr){
        if(curr == null) return; // 终止条件

        // 左
        megetravel(curr.left);

        // 中
        if(pre != null){
            res = Math.min(res, curr.val - pre.val);
        }

        pre = curr;

        // 右
        megetravel(curr.right);

    }
}
