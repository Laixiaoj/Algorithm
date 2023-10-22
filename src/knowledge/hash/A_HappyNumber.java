package knowledge.hash;// ��������һ����������ʽ�ֽ��Ƿ�����Ϊ 1 ��set ��Ϊ Hash ��
import java.util.*;

public class A_HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>(); // ����ÿ�ν��
        while(n != 1 && !record.contains(n)){ // һ��nΪ1 ���� record������n���˳�
            record.add(n);
            n = getNextN(n); // ��ʽ�ֽ�
        }
        return n == 1;
    }

    public int getNextN(int n){
        int res = 0;
        while(n != 0){
            int temp = n % 10; // ȡβ
            res += temp * temp;
            n = n / 10; // ȡ��
        }
        return res;
    }
}
