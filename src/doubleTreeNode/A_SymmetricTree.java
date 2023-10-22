// �Գƶ�����   ���ݹ顿
package doubleTreeNode;

public class A_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

       if(root == null) return true;
       return compare(root.left, root.right);

    }

    // �ݹ��߼���1.ȷ�������ͷ���ֵ  2.��ֹ����  3.�����߼����ⲿ��� - �ڲ����
    public boolean compare(TreeNode left, TreeNode right) {
        // ��ֹ����
        if(left == null && right == null) return true;  // ��Ϊ��
        else if(left == null && right != null) return false; // ��ڵ��
        else if(left != null && right == null) return false; // �ҽڵ��
        else if(left.val != right.val) return false; // ֵ����

        // �����߼�
        boolean outside = compare(left.left, right.right); // ��ڵ��� = �ҽڵ���
        boolean inside = compare(left.right, right.left);  // ��ڵ��� = �ҽڵ���

        // ����ֵ
        return outside & inside;
    }



}
