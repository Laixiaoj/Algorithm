// �Ѷ���������ת��Ϊ�ۼ���, ����������˳���ۼӷ���
package knowledge.doubleTreeNode;

public class convertBST {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        traversal(root);
        return root;
    }
    public void traversal(TreeNode root){
        if(root == null) return; // �սڵ�
        traversal(root.right); //��
        sum += root.val; // ��
        root.val = sum;
        traversal(root.left); // ��

    }
}
