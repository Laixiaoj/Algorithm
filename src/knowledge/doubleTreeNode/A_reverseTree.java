// ��ת������  ���ݹ顿
package knowledge.doubleTreeNode;

public class A_reverseTree {
    // ����ǰ�����α��� + swap ʵ��
    // �ݹ��߼���1��ȷ�������ͷ���ֵ 2����ֹ���� 3�������߼�
    public TreeNode invertTree(TreeNode root) {

        if(root == null) return root; // ��ֹ����
        // �����߼�
        swap(root); // ��
        invertTree(root.left); // ��
        invertTree(root.right); // ��
        // ����
        return root;
    }

    public void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
