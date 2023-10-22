package string;

// 字符串替换空格为 %20  【双指针 + 转字符数组】
public class replaceSpace {

    public String replaceSpace(String s) {

        if(s.length() == 0) return s;

        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){ // 统计空格数
            if(s.charAt(i) == ' ')
                str.append("  "); // 一个空格需要额外的两个位置
        }

        int left = s.length() - 1; // 原始s长度
        s += str; // 扩容s
        int right = s.length() - 1;  // 扩容s长度
        char[] ch = s.toCharArray();

        while(left >= 0){
            if(ch[left] == ' '){
                ch[right--] = '0';
                ch[right--] = '2';
                ch[right] = '%';
            }else{
                ch[right] =ch[left];
            }
            left--;
            right--;
        }

        return new String(ch);
    }
}
