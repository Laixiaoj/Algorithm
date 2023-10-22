package Interview.meituan;
import java.util.Scanner;

public class test_03_29 {
    public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];

        String input = scanner.next();
        String[] string = input.split(","); // “‘,∑÷∏Ó

        for (int i = 0; i < 4; i++) {
            a[i] = Integer.parseInt(string[i]);
        }

        System.out.println(BubbleSort(a));
    }

    public static int BubbleSort(int []a){
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            boolean isChange = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if(a[j] > a[j + 1]){
                    swap(a, i, j);
                    isChange = true;
                }
            }
            if(!isChange) break;
            else count += 1;
        }
        return count;
    }

    public static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
