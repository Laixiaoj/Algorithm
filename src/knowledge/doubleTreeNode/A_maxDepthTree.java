// ����������  ���ݹ鷨  +  ��������
package knowledge.doubleTreeNode;

import java.util.*;

public class A_maxDepthTree {
    // ����һ���������
    public int maxDepth(TreeNode root) {
        // ��ֹ����
        if(root == null) return 0;
        // �����߼�
        int leftDepth = maxDepth(root.left); // ��
        int rightDepth = maxDepth(root.right); // ��
        int depth = Math.max(leftDepth, rightDepth) + 1; // ��
        // ����ֵ
        return depth;
    }

    // ��������������  ����
    public int maxDepth2(TreeNode root) {
        if(root == null) return 0;
        // ����һ������
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root); // ���
        int depth = 0;

        while (!que.isEmpty()){ // ���϶���
            int len = que.size();
            depth++; // ����ۼ�
            while (len -- > 0){ // ������
                TreeNode temp = que.poll(); // ����
                if(temp.left != null) que.offer(temp.left); // ��
                if(temp.right != null) que.offer(temp.right); // ��
            }
        }
      return depth;
    }
}


