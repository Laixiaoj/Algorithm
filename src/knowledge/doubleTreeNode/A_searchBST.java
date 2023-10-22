// 二叉树搜索树的搜索
/*
二叉搜索树是一个有序树：
        若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值；
        若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值；
        它的左、右子树也分别为二叉搜索树
*/
package knowledge.doubleTreeNode;

public class A_searchBST {
    // 递归逻辑：1、确定参数和返回值
    public TreeNode searchBST(TreeNode root, int val) {

        // 2、终止条件：找到 val 或者 为 null
        if(root == null || root.val == val) return root;

        // 3、单层逻辑：判断 val 和 root.val 的大小来递归
        TreeNode res = new TreeNode(); // 保存结果
        if(root.val > val) // 大 进 左小
            res = searchBST(root.left, val);
        if(root.val < val) // 小 进 右大
            res =  searchBST(root.right, val);

        // 返回结果 res
        return res;
    }
}
