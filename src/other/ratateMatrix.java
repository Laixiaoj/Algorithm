package other;

import java.util.Arrays;

// ��������
public class ratateMatrix {
    public static void main(String[] args){

        int [][] res = generateMatrix(3);
        System.out.println(Arrays.toString(res));

    }

    public static int[][] generateMatrix(int n) {
        int loop = 0; // ����ѭ������
        int i, j; // ��i, j��
        int start = 0;
        int count = 1; // ������
        int[][] res = new int [n][n]; // ���

        while(loop < n / 2){
            loop ++;
            // �ϲ� ������
            for(j = start; j < n - loop; j ++)   res[start][j] = count ++;
            // �Ҳ� ���ϵ���
            for(i = start; i < n - loop; i ++)   res[i][j] = count ++;
            // �²� ���ҵ���
            for(; j >= loop; j --)   res[i][j] = count ++;
            //��� ���µ���
            for(; i >= loop; i --)   res[i][j] = count ++;

            start ++; // ������һ��
        }
        // �� n Ϊ��������Ҫ������ĵ��ֵ
        if(n % 2 == 1) res[start][start] = count;
        return res;
    }
}
