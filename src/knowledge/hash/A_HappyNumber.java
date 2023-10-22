package knowledge.hash;// 快乐数：一个数不断因式分解是否最后和为 1 【set 作为 Hash 】
import java.util.*;

public class A_HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>(); // 保存每次结果
        while(n != 1 && !record.contains(n)){ // 一旦n为1 或者 record不存在n，退出
            record.add(n);
            n = getNextN(n); // 因式分解
        }
        return n == 1;
    }

    public int getNextN(int n){
        int res = 0;
        while(n != 0){
            int temp = n % 10; // 取尾
            res += temp * temp;
            n = n / 10; // 取商
        }
        return res;
    }
}
