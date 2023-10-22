// 合并二叉树： 若都有值，则val相加作为新的值
package doubleTreeNode;

public class A_mergeTrees {
    // 递归逻辑：1、确定参数
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        // 2、终止条件：遇到其中有 null
        if(root1 == null) return root2; // r1 为空， 则仅取 r2
        if(root2 == null) return root1; // r2 为空， 则仅取 r1

        // 3、单层逻辑: 把 root1 用为 合成的 新树, 采用前序递归
        root1.val += root2.val; // 中
        root1.left = mergeTrees(root1.left, root2.left);  // 左 合 左
        root1.right = mergeTrees(root1.right, root2.right); // 右 合 右

        // 返回结果树 root1
        return root1;
    }
}
