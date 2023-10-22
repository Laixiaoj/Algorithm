// 把二叉搜索树转换为累加树, 按【右中左】顺序累加返回
package knowledge.doubleTreeNode;

public class convertBST {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        traversal(root);
        return root;
    }
    public void traversal(TreeNode root){
        if(root == null) return; // 空节点
        traversal(root.right); //右
        sum += root.val; // 中
        root.val = sum;
        traversal(root.left); // 左

    }
}
