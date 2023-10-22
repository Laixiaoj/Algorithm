// �������Ĳ�α�����������ȱ����� �������� ����ʵ�֡�
package knowledge.doubleTreeNode;
import java.util.*;

public class A_levelOrder {
    // ����һ����̬ ��ά Integer �б� res
    public List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        QueueTravel(root);
        return res;
    }

    // ���� ���� ʵ�ֱ�������������϶��£������ұ���
    public void QueueTravel(TreeNode root){

        if(root == null) return; // ��ֹ����
        // �������
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root); // ���ڵ����

        while(!que.isEmpty()){ // �����㣺���϶���
            // ����� ÿ��Ԫ��Integer ���б�
            List<Integer> item = new LinkedList<>();
            int len = que.size(); // que.size�Ƕ�̬��С

            while(len -- > 0){ // ����ÿ��Ľڵ㣺������
                TreeNode tempNode = que.poll(); // ����
                item.add(tempNode.val);
                // ��ڵ�
                if(tempNode.left != null) que.offer(tempNode.left);
                // �ҽڵ�
                if(tempNode.right != null) que.offer(tempNode.right);
            }
            res.add(item); // �� ÿ��Ľڵ�Ԫ��
        }
    }
}
