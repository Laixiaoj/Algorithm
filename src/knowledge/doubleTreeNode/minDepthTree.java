// ������С���  ����������
package knowledge.doubleTreeNode;

import java.util.*;

public class minDepthTree {
    // ������������������
    public int minDepth2(TreeNode root) {
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
                if(temp.left ==  null && temp.right == null) return depth; // �ҵ�Ҷ�ӽڵ�
                if(temp.left != null) que.offer(temp.left); // ��
                if(temp.right != null) que.offer(temp.right); // ��
            }
        }
        return depth;
    }
}
