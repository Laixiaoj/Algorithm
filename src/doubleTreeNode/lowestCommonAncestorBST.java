// �����������������������:����һ������������, �ҵ�����������ָ���ڵ������������ȡ�
package doubleTreeNode;

public class lowestCommonAncestorBST {
    public static void main(String[] args){
        TreeNode root = new TreeNode(6);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(8);
        TreeNode n3 = new TreeNode(0);
        TreeNode n4 = new TreeNode(4);
        root.left = n1;
        root.right = n2;
        root.left.left = n3;
        root.left.right = n4;
        lowestCommonAncestorBST l = new lowestCommonAncestorBST();

        TreeNode res = l.lowestCommonAncestorBST(root, n3, n4);
        System.out.println(res.val);

    }

    public TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
        // ��BST���Կ�֪���������ڵ�һ���� [p, q] ֮�䣬ֻ��Ҫ�ų� Խ���½� ���
        if(root == null) return null;
        if(root.val > p.val && root.val > q.val) // curֵ ��� q��ֵ��Խ�Ͻ�
            return lowestCommonAncestorBST(root.left, p, q);
        if(root.val < p.val && root.val < q.val) // curֵ С�� p��ֵ��Խ�½�
            return lowestCommonAncestorBST(root.right, p, q);
        return root; // �ҵ����ڵ�
    }
}
