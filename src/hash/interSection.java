package hash;// ���������ϵĽ���  ��set������Ϊ Hash��
import java.util.*;

public class interSection {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0)  return new int[0];

        Set<Integer> set = new HashSet<>();   // �� num1,ʹ��contains�ж��Ƿ����ֵ
        Set<Integer> resSet = new HashSet<>(); // ����

        for(int i : nums1) set.add(i);

        for(int i : nums2){
            if(set.contains(i)) // �ж�set�Ƿ����i
                resSet.add(i);
        }

        int[] arr = new int[resSet.size()];
        int j = 0;
        for(int i : resSet)
            arr[j++] = i;

        return arr;  // �������飬��set
    }
}
