// 左叶子之和
package knowledge.doubleTreeNode;

public class sumOfLeftLeaves {
    // 后序遍历递归
    public int sumOfLeftLeaves(TreeNode root) {
        // 终止条件
        if(root == null) return 0;
        // 单层逻辑
        int leftValue = sumOfLeftLeaves(root.left); // 左
        // 单层逻辑：找到左叶子节点
        if(root.left != null && root.left.left == null && root.left.right == null){
            leftValue = root.left.val;
        }
        int rightValue = sumOfLeftLeaves(root.right); // 右
        // 返回值
        return leftValue + rightValue;  // 中
    }
}
