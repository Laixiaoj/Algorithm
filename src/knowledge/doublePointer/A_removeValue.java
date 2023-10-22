package knowledge.doublePointer;

import java.util.Arrays;
// 移除所有等于value的元素, 不用考虑移除后的长度：【双指针遍历】
public class A_removeValue {
    public static void main(String[] args){

        int []a = {0, 1, 2, 3, 3, 0, 4, 2};
        int value = 0;
        removeElement(a, 0);
        System.out.println(Arrays.toString(a));

    }

    public static int removeElement(int[] nums, int val) {
        // 快慢指针
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

}
