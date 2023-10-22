// �������½ǵ�ֵ: �ҳ��ö������� ��ײ� ����� �ڵ��ֵ��
package knowledge.doubleTreeNode;
import java.util.*;

public class A_findBottomLeftValue {
    // �������� ���� queue
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return 0;
        int res = 0;
        // ����һ����������
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root); // ���

        while(!que.isEmpty()){ // ���϶���

            int len = que.size();

            for(int i = 0; i < len; i++){ // ������
                TreeNode temp = que.poll(); // ����
                if(i == 0) res = temp.val; // ��������ڵ��res
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);
            }
        }
        return res;
    }
}
