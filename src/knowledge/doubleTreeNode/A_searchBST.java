// ������������������
/*
������������һ����������
        ���������������գ��������������н���ֵ��С�����ĸ�����ֵ��
        ���������������գ��������������н���ֵ���������ĸ�����ֵ��
        ������������Ҳ�ֱ�Ϊ����������
*/
package knowledge.doubleTreeNode;

public class A_searchBST {
    // �ݹ��߼���1��ȷ�������ͷ���ֵ
    public TreeNode searchBST(TreeNode root, int val) {

        // 2����ֹ�������ҵ� val ���� Ϊ null
        if(root == null || root.val == val) return root;

        // 3�������߼����ж� val �� root.val �Ĵ�С���ݹ�
        TreeNode res = new TreeNode(); // ������
        if(root.val > val) // �� �� ��С
            res = searchBST(root.left, val);
        if(root.val < val) // С �� �Ҵ�
            res =  searchBST(root.right, val);

        // ���ؽ�� res
        return res;
    }
}
