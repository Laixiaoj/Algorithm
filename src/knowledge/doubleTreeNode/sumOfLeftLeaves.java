// ��Ҷ��֮��
package knowledge.doubleTreeNode;

public class sumOfLeftLeaves {
    // ��������ݹ�
    public int sumOfLeftLeaves(TreeNode root) {
        // ��ֹ����
        if(root == null) return 0;
        // �����߼�
        int leftValue = sumOfLeftLeaves(root.left); // ��
        // �����߼����ҵ���Ҷ�ӽڵ�
        if(root.left != null && root.left.left == null && root.left.right == null){
            leftValue = root.left.val;
        }
        int rightValue = sumOfLeftLeaves(root.right); // ��
        // ����ֵ
        return leftValue + rightValue;  // ��
    }
}
