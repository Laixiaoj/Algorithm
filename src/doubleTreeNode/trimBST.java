// �޼���������������ֵ�������ڡ�low�� high����
package doubleTreeNode;

public class trimBST {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null; // ����
        if(root.val < low){ // Խ�½�
            return trimBST(root.right, low, high); // ���Һ���
        }
        if(root.val > high){ // Խ�Ͻ�
            return trimBST(root.left, low, high); // ������
        }
        // �ӷ��ϵĺ���
        root.left = trimBST(root.left, low, high); // ������
        root.right = trimBST(root.right, low, high); // ���Һ���

        return root;
    }
}
