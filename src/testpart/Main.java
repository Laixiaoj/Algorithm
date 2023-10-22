package testpart;
import java.util.*;

public class Main {

    // ====================================求【拼接成最大的数】
    public static String MaxNumber(int[] nums){
        // 选择排序，每次比较两数以字符串类型前后相加后的值大小进行比较
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = Integer.valueOf("" + nums[i] + nums[j]); // 前 + 后
                int b = Integer.valueOf("" + nums[j] + nums[i]); // 后 + 前
                if(a < b){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        String res = "";
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }

        return res;
    }



    // =================================== 求【不含重复字符的最长子串的长度】
    public static int lengthOfLongestSubstring(String s) {
        // 滑动窗口  abcaa  --->  abc
        HashMap<Character, Integer> map = new HashMap<>(); // 存最长不重复子序
        int L = 0; // 子序下界
        int res = 0; // 结果
        for (int R = 0; R < s.length(); R++) {
            char element  = s.charAt(R); // 获取字符
            if(map.containsKey(element)){ // 存在该keys则为真
                L =  Math.max(L, map.get(element) + 1); // 更新下界, + 1是剔除旧重复元素
            }
            res = Math.max(res, R - L + 1); // 更新长度
            map.put(element, R); // 新字符入串
        }
        return res;
    }



    // =================================KMP算法：找出字符串中第一个匹配项的下标
    public static int strStr(String haystack, String needle){
        if(needle.length() == 0)    return 0;

        int next[] = new int[needle.length()];
        getNext(next, needle);// 基于目标串，构造前缀表

        int j = 0;

        for (int i = 0; i < haystack.length(); i++) {

            while(j > 0 && haystack.charAt(i) != needle.charAt(j))
                j = next[j - 1];

            if(haystack.charAt(i) == needle.charAt(j))
                j++;

            if(j == needle.length())
                return i - needle.length() + 1;
        }
        return -1;
    }
    // 构建前缀表
    public static void getNext(int[] next, String s){
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            // 字符不匹配
            while(j > 0 && s.charAt(i) != s.charAt(j))
                j = next[j - 1]; // 前一个字符前缀
            // 字符匹配
            if(s.charAt(i) == s.charAt(j))
                j++;
            next[i] = j;
        }
    }





    public static void main(String[] args) {
        int[] nums = {3, 32, 321};
        lengthOfLongestSubstring("abba");
    }
}