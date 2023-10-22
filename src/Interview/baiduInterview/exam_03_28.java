package Interview.baiduInterview;

import java.util.Scanner;
public class exam_03_28 {

    public void main(String[] agrs){
        Solution s= new Solution();

    }
    class Solution {
        public void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[] lst = new int[n];
            int[] isUse = new int[n];
            for (int i = 0; i < lst.length; i++) {
                lst[i] = scanner.nextInt();
            }

            QuickSort(lst, 0, lst.length - 1);

            int res = 0;

            for (int i = 0; i < m; i++) { // 回合数

                int index = n - 1;

                if(isUse[index] <= k){
                    res += lst[index];
                    isUse[index] += 1;
                }
                else{
                    index -= 1;
                    res += lst[index];
                    isUse[index] = 0;
                }

            }

            System.out.println(res);
        }

        public  int BinaryPatition(int []a, int L, int R){
            int pv = a[L]; // 取【最左元素】为基点
            int j = R; // j【从右到左】找比基点小
            int i = L; // i【左到右】找比基数大
            while(i != j){
                // j方向
                while (a[j] > pv && i < j) j--;
                // i方向
                while (a[i] <= pv && i < j) i++;
                //小交换到左边，大交换到右边
                swap(a, i, j);
            }
            swap(a, L, j); // 基点元素交换到中间
            return j; // 返回新基点位置
        }
        public  void QuickSort(int []a, int L, int R){
            if(L >= R) return;
            int q = BinaryPatition(a, L, R); // 找基点
            QuickSort(a, L, q - 1); // 基点左区域
            QuickSort(a, q + 1, R); // 基点右区域
        }
        public  void swap(int []a, int i ,int j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }

    }
}
