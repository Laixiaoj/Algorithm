package other;

// ����ö���������
public class A_longestPalindrome {

    public static void main(String[] args){
        System.out.println(longestPalindrome("bcac"));
    }

    // �ж������Ƿ�Ϊ����
    public static boolean isPalindrome(String s){
        int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if(s.charAt(i) != s.charAt(l - 1 - i))
                return false;
        }
        return true;
    }

    public static String longestPalindrome(String s){
        String res = "";  // ���������
        int sumLen = 0;  // ��ǰ���ĵĳ���
        for (int i = 0; i < s.length(); i++) {  // ���������ַ�
            for(int j = i + 1; j <= s.length(); j++){ // �������п��ܵ�����
                String temp = s.substring(i, j); // �������
                if(isPalindrome(temp) && temp.length() > sumLen){ // �жϵ�ǰ�Ƿ�Ϊ��Ļ���
                    res = temp; // ���»���
                    sumLen = temp.length(); // ���»��ĵĳ���
                    if(res.equals(s.substring(i, s.length()))) // ���һ��������������
                        return res;
                }

            }
        }
        return res;
    }

}
