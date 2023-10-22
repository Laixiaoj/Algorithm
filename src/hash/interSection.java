package hash;// 求两个集合的交集  【set集合作为 Hash】
import java.util.*;

public class interSection {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0)  return new int[0];

        Set<Integer> set = new HashSet<>();   // 存 num1,使用contains判断是否存在值
        Set<Integer> resSet = new HashSet<>(); // 存结果

        for(int i : nums1) set.add(i);

        for(int i : nums2){
            if(set.contains(i)) // 判断set是否存在i
                resSet.add(i);
        }

        int[] arr = new int[resSet.size()];
        int j = 0;
        for(int i : resSet)
            arr[j++] = i;

        return arr;  // 返回数组，非set
    }
}
