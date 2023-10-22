package other;

// 暴力枚举求最长回文
public class A_longestPalindrome {

    public static void main(String[] args){
        System.out.println(longestPalindrome("bcac"));
    }

    // 判断子序是否为回文
    public static boolean isPalindrome(String s){
        int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if(s.charAt(i) != s.charAt(l - 1 - i))
                return false;
        }
        return true;
    }

    public static String longestPalindrome(String s){
        String res = "";  // 保存最长回文
        int sumLen = 0;  // 当前回文的长度
        for (int i = 0; i < s.length(); i++) {  // 遍历所有字符
            for(int j = i + 1; j <= s.length(); j++){ // 遍历所有可能的子序
                String temp = s.substring(i, j); // 获得子序
                if(isPalindrome(temp) && temp.length() > sumLen){ // 判断当前是否为最长的回文
                    res = temp; // 更新回文
                    sumLen = temp.length(); // 更新回文的长度
                    if(res.equals(s.substring(i, s.length()))) // 如果一轮下来整个就是
                        return res;
                }

            }
        }
        return res;
    }

}
