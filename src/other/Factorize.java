// 求因式分解的最小和

package other;
import java.util.*;
/*
 * @author:vincent.lai
 * @cuTime:2023.10.22
*/
public class Factorize {

    static boolean isFactorize = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> factorizes = factorize(num); // 因式分解
        int sum = factorizes.stream().reduce(0, Integer::sum); // 求和
        sum = isFactorize ? sum : (sum + 1);
        System.out.println("因式分解：" + factorizes);
        System.out.println("最小值为：" + sum);
    }

    private static List<Integer> factorize(int nextInt) {
        List<Integer> factorizes = new ArrayList<>();

        for (int i = 2; i <= nextInt / 2; i++) {
            if(nextInt % i == 0){
                isFactorize = true;
                factorizes.add(i);
                factorizes.addAll(factorize(nextInt / i)); // 将分解的因式都加进
                return factorizes;
            }
        }
        factorizes.add(nextInt); // 无因子
        return factorizes;
    }
}

