// ·���ܺͣ��жϸ������Ƿ���� ���ڵ㵽Ҷ�ӽڵ� ��·��������·�������нڵ�ֵ��ӵ���Ŀ��� targetSum
package knowledge.doubleTreeNode;

public class A_hasPathSum {
    // ǰ��ݹ�
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false; // ����
        return travesal(root, targetSum - root.val);

    }

    // 1. ȷ��������root, sum���ͷ���ֵ(boolean)
    public boolean travesal(TreeNode root, int targetSum) {

        // 2. ��ֹ�������ҵ�Ҷ�ӽڵ���ֵΪ0
        if(root.left == null && root.right == null && targetSum == 0) return true;
        if(root.left == null && root.right == null) return false;

        // 3. �����߼������һ���
        if(root.left != null){ // ��
            targetSum -= root.left.val;
            if(travesal(root.left, targetSum)) return true; // �ҵ�����
            targetSum += root.left.val; // ����
        }

        if(root.right != null){ // ��
            targetSum -= root.right.val;
            if(travesal(root.right, targetSum)) return true; // �ҵ�����
            targetSum += root.right.val; // ����
        }

        return false; //

    }
}
