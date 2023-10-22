// 路径总和：判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum
package knowledge.doubleTreeNode;

public class A_hasPathSum {
    // 前序递归
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false; // 空树
        return travesal(root, targetSum - root.val);

    }

    // 1. 确定参数（root, sum）和返回值(boolean)
    public boolean travesal(TreeNode root, int targetSum) {

        // 2. 终止条件：找到叶子节点且值为0
        if(root.left == null && root.right == null && targetSum == 0) return true;
        if(root.left == null && root.right == null) return false;

        // 3. 单层逻辑：左右回溯
        if(root.left != null){ // 左
            targetSum -= root.left.val;
            if(travesal(root.left, targetSum)) return true; // 找到返回
            targetSum += root.left.val; // 回溯
        }

        if(root.right != null){ // 右
            targetSum -= root.right.val;
            if(travesal(root.right, targetSum)) return true; // 找到返回
            targetSum += root.right.val; // 回溯
        }

        return false; //

    }
}
