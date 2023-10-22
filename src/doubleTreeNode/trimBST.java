// 修剪二叉搜索树：将值都保持在【low， high】内
package doubleTreeNode;

public class trimBST {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null; // 空树
        if(root.val < low){ // 越下界
            return trimBST(root.right, low, high); // 进右孩子
        }
        if(root.val > high){ // 越上界
            return trimBST(root.left, low, high); // 进左孩子
        }
        // 接符合的孩子
        root.left = trimBST(root.left, low, high); // 接左孩子
        root.right = trimBST(root.right, low, high); // 接右孩子

        return root;
    }
}
