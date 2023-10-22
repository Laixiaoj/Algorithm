package doublePointer;

// 反转字符串  【双指针】
public class A_reverseString_I {
    public void reverseString(char[] s) {
        // 双指针问题
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
