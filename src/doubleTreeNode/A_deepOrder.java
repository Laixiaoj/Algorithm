// ������ǰ�к��������������ȱ�����  ���ݹ�ʵ�֡�
package doubleTreeNode;
import java.util.*;

public class A_deepOrder {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    // �ݹ��ѯ��1��ȷ�������ͷ���ֵ 2��ȷ����ֹ���� 3��ȷ������ݹ��߼�
    public void preorder(TreeNode cur, List<Integer> res){
        // ��ֹ����
        if(cur == null) return; // ��ǰ�ڵ��Ƿ�Ϊ��
        //�����߼�
        res.add(cur.val); // ��
        preorder(cur.left, res); // ��
        preorder(cur.right, res); // ��
    }


}
