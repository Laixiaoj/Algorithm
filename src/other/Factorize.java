// ����ʽ�ֽ����С��

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
        List<Integer> factorizes = factorize(num); // ��ʽ�ֽ�
        int sum = factorizes.stream().reduce(0, Integer::sum); // ���
        sum = isFactorize ? sum : (sum + 1);
        System.out.println("��ʽ�ֽ⣺" + factorizes);
        System.out.println("��СֵΪ��" + sum);
    }

    private static List<Integer> factorize(int nextInt) {
        List<Integer> factorizes = new ArrayList<>();

        for (int i = 2; i <= nextInt / 2; i++) {
            if(nextInt % i == 0){
                isFactorize = true;
                factorizes.add(i);
                factorizes.addAll(factorize(nextInt / i)); // ���ֽ����ʽ���ӽ�
                return factorizes;
            }
        }
        factorizes.add(nextInt); // ������
        return factorizes;
    }
}

