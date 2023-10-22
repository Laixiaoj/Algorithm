// 二叉树的最近公共祖先:给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
package knowledge.doubleTreeNode;

public class lowestCommonAncestor {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n3 = new TreeNode(4);
        TreeNode n2 = new TreeNode(3);
        root.right = n3;
        root.left = n1;
        root.right.left = n2;
        lowestCommonAncestor l = new lowestCommonAncestor();

        TreeNode res = l.lowestCommonAncestor(root, n1, n2);
        System.out.println(res.val);


    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 后序遍历回溯特性，能实现自底向上找公共父节点
        // 终止条件：root为 null，或者 找到 p q
        if(root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q); // 左
        TreeNode right = lowestCommonAncestor(root.right, p, q); // 右

        if(left == null && right == null) // 都为空，返回null
            return null;
        else if(left != null && right == null) // 左不为空，返回左
            return left;
        else  if(left == null && right != null) // 右不为空，返回右
            return right;
        else // 找到父节点
            return root;
    }
}
