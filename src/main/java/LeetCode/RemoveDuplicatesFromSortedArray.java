package LeetCode;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {

    /*

    Esta função recebe um array como parâmetro e retorna o tamanho do array após remover os números duplicados (k).
    Os primeiros k elementos do array são os números em ordem crescente.
    */

    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!lista.contains(nums[i])) {
                lista.add(nums[i]);
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            nums[i] = lista.get(i);
        }
        return lista.size();
    }
}
