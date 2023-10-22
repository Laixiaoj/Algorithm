// ƽ�������: һ��������ÿ���ڵ� ���������������ĸ߶Ȳ�ľ���ֵ������ 1
package knowledge.doubleTreeNode;

public class A_isBalanced {

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    // �ݹ���߶�
    public int getHeight(TreeNode root){
        // ��ֹ����
        if(root == null) return 0;

        // �����߼�
        int leftNode = getHeight(root.left);
        if(leftNode == -1) return -1;
        int rightNode = getHeight(root.right);
        if(rightNode == -1) return -1;
        if(Math.abs(leftNode - rightNode) > 1) return -1;

        // ����ֵ
        return Math.max(leftNode, rightNode) + 1;

    }
}
