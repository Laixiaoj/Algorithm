package other;

import java.util.Arrays;

// 螺旋矩阵
public class ratateMatrix {
    public static void main(String[] args){

        int [][] res = generateMatrix(3);
        System.out.println(Arrays.toString(res));

    }

    public static int[][] generateMatrix(int n) {
        int loop = 0; // 控制循环次数
        int i, j; // （i, j）
        int start = 0;
        int count = 1; // 代填数
        int[][] res = new int [n][n]; // 结果

        while(loop < n / 2){
            loop ++;
            // 上侧 从左到右
            for(j = start; j < n - loop; j ++)   res[start][j] = count ++;
            // 右侧 从上到下
            for(i = start; i < n - loop; i ++)   res[i][j] = count ++;
            // 下侧 从右到左
            for(; j >= loop; j --)   res[i][j] = count ++;
            //左侧 从下到上
            for(; i >= loop; i --)   res[i][j] = count ++;

            start ++; // 进入下一层
        }
        // 若 n 为奇数，需要添加中心点的值
        if(n % 2 == 1) res[start][start] = count;
        return res;
    }
}
