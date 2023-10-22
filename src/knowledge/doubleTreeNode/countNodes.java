// ��ȫ�������Ľڵ������ͳ�����нڵ�
package knowledge.doubleTreeNode;
import java.util.*;
public class countNodes {

    // ����һ���ݹ鷨��1��ȷ�������ͷ���ֵ 2����ֹ���� 3�������߼�
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int leftNode = countNodes(root.left); // ��
        int rightNode = countNodes(root.right); // ��
        return leftNode + rightNode + 1; // ��

    }
     // ��������������  ����
     public int countNodes1(TreeNode root) {
         if(root == null) return 0;
         // ����һ������
         Deque<TreeNode> que = new LinkedList<>();
         que.offer(root); // ���
         int depth = 0;

         while (!que.isEmpty()){ // ���϶���
             int len = que.size();
             while (len -- > 0){ // ������
                 TreeNode temp = que.poll(); // ����
                 depth++; // �ڵ��ۼ�
                 if(temp.left != null) que.offer(temp.left); // ��
                 if(temp.right != null) que.offer(temp.right); // ��
             }
         }
       return depth;
     }
}
