// 平衡二叉树: 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1
package knowledge.doubleTreeNode;

public class A_isBalanced {

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    // 递归求高度
    public int getHeight(TreeNode root){
        // 终止条件
        if(root == null) return 0;

        // 单层逻辑
        int leftNode = getHeight(root.left);
        if(leftNode == -1) return -1;
        int rightNode = getHeight(root.right);
        if(rightNode == -1) return -1;
        if(Math.abs(leftNode - rightNode) > 1) return -1;

        // 返回值
        return Math.max(leftNode, rightNode) + 1;

    }
}
