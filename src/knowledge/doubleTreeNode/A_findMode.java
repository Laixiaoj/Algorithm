// �ҵ����������������е��������������������Ϊ������ر���в���
package knowledge.doubleTreeNode;
import java.util.ArrayList;
/*
        ��δ�һ�������������ҵ����е�������
1. maxCount���ͳ������count��ǰ��ͳ��������pre��¼��ǰֵ��ǰһ������ArrayList�洢����
2. Count > maxCount, �����ArrayList�����ٲ���ArrayList
3. Count = maxCount������ArrayList

*/

public class A_findMode {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(2);
        root.right = n1;
        root.right.left = n2;
        A_findMode f = new A_findMode();
        int[] re = f.findMode(root);
        for (int i = 0; i < re.length; i++) {
            System.out.println(re[i]);
        }


    }

    ArrayList<Integer> res = new ArrayList<>(); // resList��¼�������
    int MaxCount = 0; // ���ͳ����
    int count = 0; // ��ǰͳ����
    TreeNode pre = null; // ��ǰ�ڵ��ǰһ��������Ƚ�

    public int[] findMode(TreeNode root) {
        midTraversal(root);
        int[] result = new int[res.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    public void midTraversal(TreeNode root){
        if(root == null) return;

        midTraversal(root.left); // ��

        if(pre == null || pre.val != root.val) // ��
            count = 1;
        else
            count ++;

        // ����maxCount
        if(count > MaxCount){ // ���ָ�������������
            res.clear(); // ���
            res.add(root.val);
            MaxCount = count;
        }
        else if(count == MaxCount) // ����������
            res.add(root.val);
        pre = root;

        midTraversal(root.right); // ��
    }
}
