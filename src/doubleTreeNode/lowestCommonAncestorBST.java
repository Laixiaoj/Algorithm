// 二叉搜索树的最近公共祖先:给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
package doubleTreeNode;

public class lowestCommonAncestorBST {
    public static void main(String[] args){
        TreeNode root = new TreeNode(6);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(8);
        TreeNode n3 = new TreeNode(0);
        TreeNode n4 = new TreeNode(4);
        root.left = n1;
        root.right = n2;
        root.left.left = n3;
        root.left.right = n4;
        lowestCommonAncestorBST l = new lowestCommonAncestorBST();

        TreeNode res = l.lowestCommonAncestorBST(root, n3, n4);
        System.out.println(res.val);

    }

    public TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
        // 由BST特性可知，公共父节点一定在 [p, q] 之间，只需要排除 越上下界 情况
        if(root == null) return null;
        if(root.val > p.val && root.val > q.val) // cur值 大过 q的值，越上界
            return lowestCommonAncestorBST(root.left, p, q);
        if(root.val < p.val && root.val < q.val) // cur值 小过 p的值，越下界
            return lowestCommonAncestorBST(root.right, p, q);
        return root; // 找到父节点
    }
}
