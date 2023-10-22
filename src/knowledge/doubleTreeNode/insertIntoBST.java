// �����������еĲ������
package knowledge.doubleTreeNode;

public class insertIntoBST {
    public static void main(String[] args){
        TreeNode root = new TreeNode(6);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(8);

        root.left = n1;
        root.right = n2;

        insertIntoBST i = new insertIntoBST();
        i.insertIntoBST(root, 4);

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val); // �������
        TreeNode newRoot = root; // �����ĸ����䣬����������root
        TreeNode pre = root; // ������ڵ�ĸ��ڵ�
        while (root != null){
            pre = root; // ���¸��ڵ�
            if(root.val > val) // ƫ��
                root = root.left;
            else
                root = root.right; // ƫС
        }

        // ����
        if(pre.val > val)
            pre.left = new TreeNode(val);
        else
            pre.right = new TreeNode(val);

        return newRoot;
    }
}
