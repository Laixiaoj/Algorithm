// 找到【二叉搜索树】中的众数：利用其中序遍历为升序的特别进行查找
package knowledge.doubleTreeNode;
import java.util.ArrayList;
/*
        如何从一个有序数组中找到所有的众数：
1. maxCount最大统计数，count当前的统计数，【pre记录当前值的前一个】，ArrayList存储众数
2. Count > maxCount, 【清空ArrayList】，再插入ArrayList
3. Count = maxCount，插入ArrayList

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

    ArrayList<Integer> res = new ArrayList<>(); // resList记录最大众数
    int MaxCount = 0; // 最大统计数
    int count = 0; // 当前统计数
    TreeNode pre = null; // 当前节点的前一个，方便比较

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

        midTraversal(root.left); // 左

        if(pre == null || pre.val != root.val) // 中
            count = 1;
        else
            count ++;

        // 更新maxCount
        if(count > MaxCount){ // 出现更大的众数的情况
            res.clear(); // 清空
            res.add(root.val);
            MaxCount = count;
        }
        else if(count == MaxCount) // 多个众数情况
            res.add(root.val);
        pre = root;

        midTraversal(root.right); // 右
    }
}
