package knowledge.huaDongWindow;

// 求和不小于 target 长度最小的子数组  【滑动窗口】
public class A_minSubArrayLen {

    public static void main(String[] args){

        int []a = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, a));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE; // 默认最大长度
        int subLen = 0; // 当前子序长
        int sum = 0; // 子序列和
        int L = 0; // 子序列起点，待更新
        for(int R = 0; R < nums.length; R++){
            sum += nums[R];
            while(sum >= target){ // 滑动窗口思想
                subLen = (R - L + 1);
                result = Math.min(subLen, result);
                sum -= nums[L];
                L++;
            }
        }
        return result == Integer.MAX_VALUE ? 0:result;
    }





}
