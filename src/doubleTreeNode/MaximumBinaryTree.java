// �����������ݹ�������ֵ ��� �� ������ǰ׺�� ������������
//�ݹ�������ֵ �ұ� �� �������׺�� ������������
package doubleTreeNode;

public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return travesal(nums, 0 , nums.length);
    }

    // 1.ȷ������ nums��left��right, ����ֵ TreeNode
    public TreeNode travesal(int[] nums, int left, int right) {
        // 2. ��ֹ����
        if(right - left < 1) return null; // ��Ԫ��
        if(right - left == 1) return new TreeNode(nums[left]); // ʣ��һ��Ԫ��

        // �����߼����ҵ����ֵ�Լ��±�
        int maxIndex = left;
        int maxNum = nums[maxIndex];

        for(int i = left + 1; i < right; i++){
            if(nums[i] > maxNum){
                maxNum = nums[i];
                maxIndex = i;
            }

        }

        TreeNode root = new TreeNode(maxNum); // �ҵ������ڵ�
        root.left = travesal(nums, left, maxIndex); // ��
        root.right = travesal(nums, maxIndex + 1, right); // ��

        // 2. ����ֵ
        return root;

    }
}
