package string;

// 字符串匹配：从 haystack 匹配 needle ，返回第一个符合的下标  KMP算法
public class A_stringBatch {

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

    public static void main(String[] args){
        System.out.println(strStr("heeeasdllo", "ll"));
    }


}
