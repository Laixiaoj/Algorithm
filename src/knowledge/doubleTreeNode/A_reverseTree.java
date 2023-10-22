// 翻转二叉树  【递归】
package knowledge.doubleTreeNode;

public class A_reverseTree {
    // 采用前后序层次遍历 + swap 实现
    // 递归逻辑：1、确定参数和返回值 2、终止条件 3、单层逻辑
    public TreeNode invertTree(TreeNode root) {

        if(root == null) return root; // 终止条件
        // 单层逻辑
        swap(root); // 中
        invertTree(root.left); // 左
        invertTree(root.right); // 右
        // 返回
        return root;
    }

    public void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
