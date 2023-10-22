package knowledge.doublePointer;// ����֮��Ϊ 0 ������һ������  ��˫ָ������
import java.util.*;

public class threeNumberSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // ˫ָ����{a, b, c} a + b + c = 0
        List<List<Integer>> res = new ArrayList<>(); // ���
        Arrays.sort(nums); // ����

        for(int i = 0; i < nums.length; i++){ // a �ı���

            if(nums[i] > 0) return res; // �����׸�Ԫ�� > 0,return

            if(i > 0 && nums[i] == nums[i - 1]) continue; // ȥ�� a

            int left = i + 1;  // b
            int right = nums.length - 1; // c

            while(left < right){

                if(nums[i] + nums[left] + nums[right] > 0) // ƫ��
                    right --;
                else if(nums[i] + nums[left] + nums[right] < 0) // ƫС
                    left ++;
                else{ // ���
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // �ҵ�һ����ȥ�� b �� c
                    while(left < right && nums[left] == nums[left + 1]) left ++;
                    while(left < right && nums[right] == nums[right - 1]) right --;

                    right --;
                    left ++;
                }
            }
        }
        return res;
    }

}
