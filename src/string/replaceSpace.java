package string;

// �ַ����滻�ո�Ϊ %20  ��˫ָ�� + ת�ַ����顿
public class replaceSpace {

    public String replaceSpace(String s) {

        if(s.length() == 0) return s;

        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){ // ͳ�ƿո���
            if(s.charAt(i) == ' ')
                str.append("  "); // һ���ո���Ҫ���������λ��
        }

        int left = s.length() - 1; // ԭʼs����
        s += str; // ����s
        int right = s.length() - 1;  // ����s����
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
