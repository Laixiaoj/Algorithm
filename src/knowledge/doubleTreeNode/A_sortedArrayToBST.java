//  ����������ת��Ϊ����������
package knowledge.doubleTreeNode;

public class A_sortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return traversal(nums, 0, nums.length - 1);
    }

    public TreeNode traversal(int[] nums, int left, int right){
        if(left > right) return null; // û��Ԫ�����
        // �ָ��е�ֵ
        int mid = left + ((right - left) / 2); // ��֤ mid ֵ Խ int ��Χ
        TreeNode root = new TreeNode(nums[mid]);
        root.left = traversal(nums, left, mid - 1); // �ӳ�����
        root.right = traversal(nums, mid + 1, right); // �ӳ��Һ���
        return root;
    }
}
