// �������������������:����һ��������, �ҵ�����������ָ���ڵ������������ȡ�
package knowledge.doubleTreeNode;

public class lowestCommonAncestor {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n3 = new TreeNode(4);
        TreeNode n2 = new TreeNode(3);
        root.right = n3;
        root.left = n1;
        root.right.left = n2;
        lowestCommonAncestor l = new lowestCommonAncestor();

        TreeNode res = l.lowestCommonAncestor(root, n1, n2);
        System.out.println(res.val);


    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // ��������������ԣ���ʵ���Ե������ҹ������ڵ�
        // ��ֹ������rootΪ null������ �ҵ� p q
        if(root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q); // ��
        TreeNode right = lowestCommonAncestor(root.right, p, q); // ��

        if(left == null && right == null) // ��Ϊ�գ�����null
            return null;
        else if(left != null && right == null) // ��Ϊ�գ�������
            return left;
        else  if(left == null && right != null) // �Ҳ�Ϊ�գ�������
            return right;
        else // �ҵ����ڵ�
            return root;
    }
}
