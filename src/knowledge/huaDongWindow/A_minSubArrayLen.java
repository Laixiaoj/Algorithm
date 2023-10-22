package knowledge.huaDongWindow;

// ��Ͳ�С�� target ������С��������  ���������ڡ�
public class A_minSubArrayLen {

    public static void main(String[] args){

        int []a = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, a));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE; // Ĭ����󳤶�
        int subLen = 0; // ��ǰ����
        int sum = 0; // �����к�
        int L = 0; // ��������㣬������
        for(int R = 0; R < nums.length; R++){
            sum += nums[R];
            while(sum >= target){ // ��������˼��
                subLen = (R - L + 1);
                result = Math.min(subLen, result);
                sum -= nums[L];
                L++;
            }
        }
        return result == Integer.MAX_VALUE ? 0:result;
    }





}
