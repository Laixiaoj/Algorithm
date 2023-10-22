// ������������·��
package knowledge.doubleTreeNode;
import java.util.*;
public class binaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        // ��߶ȣ��ݹ�ǰ�������res·���б�Ԫ���б�
        List<String> res = new ArrayList<>();

        if(root == null) return res;

        List<Integer> path = new ArrayList<>();

        traversal(root, res, path);

        return res;
    }

    public void traversal(TreeNode root, List<String> res, List<Integer> path){

        path.add(root.val); // ��: λ�ò��ܶ�

        // ��ֹ�������ҵ�Ҷ�ӽڵ�
        if(root.left == null && root.right == null){
            // ��̬�ַ���
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < path.size() - 1; i++){
                sb.append(path.get(i)).append("->");
            }
            sb.append(path.get(path.size() - 1));
            res.add(sb.toString());

            return;
        }

        // �����߼�
        if(root.left != null){
            traversal(root.left, res, path); // ��
            path.remove(path.size() - 1); // ����
        }
        if(root.right != null){
            traversal(root.right, res, path); // ��
            path.remove(path.size() - 1); // ����
        }

    }
}
