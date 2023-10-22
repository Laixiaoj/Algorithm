package hash;// 四数之和为 0 ：来自四个数组  【Map 作为 Hash】
import java.util.*;

public class fourNumberSum_I {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        // {key: nums1 + nums2, value: count(nums1 + nums2)}
        Map<Integer, Integer> record = new HashMap<>();
        int temp = 0;
        int res = 0; // 结果

        for(int i : nums1){ // 计算num1 和 num2 所有两数和 并且 统计次数
            for(int j : nums2){
                temp = i + j;
                if(record.containsKey(temp)){
                    record.put(temp, record.get(temp) + 1);
                }else{
                    record.put(temp, 1);
                }
            }
        }

        for(int i : nums3){// 计算num3 和 num4 所有两数和 并且 判断是否在record中出现
            for(int j : nums4){
                temp = i + j;
                if(record.containsKey(0 - temp)){
                    res += record.get(0 - temp);
                }
            }
        }
        return res;
    }
}
