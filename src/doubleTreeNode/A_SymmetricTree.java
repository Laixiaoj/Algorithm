// 对称二叉树   【递归】
package doubleTreeNode;

public class A_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

       if(root == null) return true;
       return compare(root.left, root.right);

    }

    // 递归逻辑：1.确定参数和返回值  2.终止条件  3.单层逻辑：外部相等 - 内部相等
    public boolean compare(TreeNode left, TreeNode right) {
        // 终止条件
        if(left == null && right == null) return true;  // 都为空
        else if(left == null && right != null) return false; // 左节点空
        else if(left != null && right == null) return false; // 右节点空
        else if(left.val != right.val) return false; // 值不等

        // 单层逻辑
        boolean outside = compare(left.left, right.right); // 左节点左 = 右节点右
        boolean inside = compare(left.right, right.left);  // 左节点右 = 右节点左

        // 返回值
        return outside & inside;
    }



}
