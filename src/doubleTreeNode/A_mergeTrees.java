// �ϲ��������� ������ֵ����val�����Ϊ�µ�ֵ
package doubleTreeNode;

public class A_mergeTrees {
    // �ݹ��߼���1��ȷ������
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        // 2����ֹ���������������� null
        if(root1 == null) return root2; // r1 Ϊ�գ� ���ȡ r2
        if(root2 == null) return root1; // r2 Ϊ�գ� ���ȡ r1

        // 3�������߼�: �� root1 ��Ϊ �ϳɵ� ����, ����ǰ��ݹ�
        root1.val += root2.val; // ��
        root1.left = mergeTrees(root1.left, root2.left);  // �� �� ��
        root1.right = mergeTrees(root1.right, root2.right); // �� �� ��

        // ���ؽ���� root1
        return root1;
    }
}
