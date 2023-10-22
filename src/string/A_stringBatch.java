package string;

// �ַ���ƥ�䣺�� haystack ƥ�� needle �����ص�һ�����ϵ��±�  KMP�㷨
public class A_stringBatch {

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

    public static void main(String[] args){
        System.out.println(strStr("heeeasdllo", "ll"));
    }


}
