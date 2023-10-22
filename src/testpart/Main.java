package testpart;
import java.util.*;

public class Main {

    // ====================================��ƴ�ӳ���������
    public static String MaxNumber(int[] nums){
        // ѡ������ÿ�αȽ��������ַ�������ǰ����Ӻ��ֵ��С���бȽ�
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = Integer.valueOf("" + nums[i] + nums[j]); // ǰ + ��
                int b = Integer.valueOf("" + nums[j] + nums[i]); // �� + ǰ
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



    // =================================== �󡾲����ظ��ַ�����Ӵ��ĳ��ȡ�
    public static int lengthOfLongestSubstring(String s) {
        // ��������  abcaa  --->  abc
        HashMap<Character, Integer> map = new HashMap<>(); // ������ظ�����
        int L = 0; // �����½�
        int res = 0; // ���
        for (int R = 0; R < s.length(); R++) {
            char element  = s.charAt(R); // ��ȡ�ַ�
            if(map.containsKey(element)){ // ���ڸ�keys��Ϊ��
                L =  Math.max(L, map.get(element) + 1); // �����½�, + 1���޳����ظ�Ԫ��
            }
            res = Math.max(res, R - L + 1); // ���³���
            map.put(element, R); // ���ַ��봮
        }
        return res;
    }



    // =================================KMP�㷨���ҳ��ַ����е�һ��ƥ������±�
    public static int strStr(String haystack, String needle){
        if(needle.length() == 0)    return 0;

        int next[] = new int[needle.length()];
        getNext(next, needle);// ����Ŀ�괮������ǰ׺��

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
    // ����ǰ׺��
    public static void getNext(int[] next, String s){
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            // �ַ���ƥ��
            while(j > 0 && s.charAt(i) != s.charAt(j))
                j = next[j - 1]; // ǰһ���ַ�ǰ׺
            // �ַ�ƥ��
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