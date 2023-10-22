package knowledge.string;

// ��ת�ַ���  ��˫ָ�롿
public class reverseString_I {
    public void reverseString(char[] s) {
        // ˫ָ������
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
