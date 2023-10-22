// ��������������С���Բ�
package knowledge.doubleTreeNode;

public class getMinimumDifference {
    int res = Integer.MAX_VALUE;
    TreeNode pre; // ��ǰ�ڵ��ǰһ���ڵ�

    public int getMinimumDifference(TreeNode root) {
        if(root == null) return 0; // ����
        megetravel(root);
        return res;
    }

    // BST����������Ϊ��������
    public void megetravel(TreeNode curr){
        if(curr == null) return; // ��ֹ����

        // ��
        megetravel(curr.left);

        // ��
        if(pre != null){
            res = Math.min(res, curr.val - pre.val);
        }

        pre = curr;

        // ��
        megetravel(curr.right);

    }
}
