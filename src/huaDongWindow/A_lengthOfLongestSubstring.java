// 求【不含重复字符的最长子串的长度】 【滑动窗口】
package huaDongWindow;
import java.util.*;

public class A_lengthOfLongestSubstring {

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

}
