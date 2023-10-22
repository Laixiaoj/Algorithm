// 二叉树的所有路径
package knowledge.doubleTreeNode;
import java.util.*;
public class binaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        // 求高度：递归前序遍历、res路径列表、元素列表
        List<String> res = new ArrayList<>();

        if(root == null) return res;

        List<Integer> path = new ArrayList<>();

        traversal(root, res, path);

        return res;
    }

    public void traversal(TreeNode root, List<String> res, List<Integer> path){

        path.add(root.val); // 中: 位置不能动

        // 终止条件：找到叶子节点
        if(root.left == null && root.right == null){
            // 动态字符串
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < path.size() - 1; i++){
                sb.append(path.get(i)).append("->");
            }
            sb.append(path.get(path.size() - 1));
            res.add(sb.toString());

            return;
        }

        // 单层逻辑
        if(root.left != null){
            traversal(root.left, res, path); // 左
            path.remove(path.size() - 1); // 回溯
        }
        if(root.right != null){
            traversal(root.right, res, path); // 右
            path.remove(path.size() - 1); // 回溯
        }

    }
}
