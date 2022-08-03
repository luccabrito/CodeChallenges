package LeetCode;

public class RotateArray {

    /* ----> Desta forma, consegui resolver 34 dos 38 casos de teste. Quando o array começa a ficar muito grande,
    public static void avancaUm(int[] nums) { -----> falta memória para fazer desta forma.
        int[] copiaNumeros = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temporario = nums[i];
            if (i == nums.length - 1) {
                copiaNumeros[0] = temporario;
            } else {
                copiaNumeros[i+1] = temporario;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = copiaNumeros[i];
        }
    }
    */

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
