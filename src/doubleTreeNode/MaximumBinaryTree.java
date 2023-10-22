// 最大二叉树：递归地在最大值 左边 的 子数组前缀上 构建左子树。
//递归地在最大值 右边 的 子数组后缀上 构建右子树。
package doubleTreeNode;

public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return travesal(nums, 0 , nums.length);
    }

    // 1.确定参数 nums，left，right, 返回值 TreeNode
    public TreeNode travesal(int[] nums, int left, int right) {
        // 2. 终止条件
        if(right - left < 1) return null; // 无元素
        if(right - left == 1) return new TreeNode(nums[left]); // 剩下一个元素

        // 单层逻辑：找到最大值以及下标
        int maxIndex = left;
        int maxNum = nums[maxIndex];

        for(int i = left + 1; i < right; i++){
            if(nums[i] > maxNum){
                maxNum = nums[i];
                maxIndex = i;
            }

        }

        TreeNode root = new TreeNode(maxNum); // 找到最大根节点
        root.left = travesal(nums, left, maxIndex); // 左
        root.right = travesal(nums, maxIndex + 1, right); // 右

        // 2. 返回值
        return root;

    }
}
