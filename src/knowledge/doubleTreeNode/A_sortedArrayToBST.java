//  将有序数组转换为二叉搜索树
package knowledge.doubleTreeNode;

public class A_sortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return traversal(nums, 0, nums.length - 1);
    }

    public TreeNode traversal(int[] nums, int left, int right){
        if(left > right) return null; // 没有元素情况
        // 分割中点值
        int mid = left + ((right - left) / 2); // 保证 mid 值 越 int 范围
        TreeNode root = new TreeNode(nums[mid]);
        root.left = traversal(nums, left, mid - 1); // 接长左孩子
        root.right = traversal(nums, mid + 1, right); // 接长右孩子
        return root;
    }
}
