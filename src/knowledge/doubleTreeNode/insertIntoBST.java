// 二又搜索树中的插入操作
package knowledge.doubleTreeNode;

public class insertIntoBST {
    public static void main(String[] args){
        TreeNode root = new TreeNode(6);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(8);

        root.left = n1;
        root.right = n2;

        insertIntoBST i = new insertIntoBST();
        i.insertIntoBST(root, 4);

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val); // 空树情况
        TreeNode newRoot = root; // 新树的根不变，整棵树还是root
        TreeNode pre = root; // 待插入节点的父节点
        while (root != null){
            pre = root; // 更新父节点
            if(root.val > val) // 偏大
                root = root.left;
            else
                root = root.right; // 偏小
        }

        // 插入
        if(pre.val > val)
            pre.left = new TreeNode(val);
        else
            pre.right = new TreeNode(val);

        return newRoot;
    }
}
