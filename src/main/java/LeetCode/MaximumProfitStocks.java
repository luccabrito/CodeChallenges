package LeetCode;
    /*
        You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
        On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at
        any time. However, you can buy it then immediately sell it on the same day.
        Find and return the maximum profit you can achieve.
     */
public class MaximumProfitStocks {
    public static void main(String[] args) {
        int[] precos = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(precos));
    }

    public static int maxProfit(int[] precos) {
        int valorLucro = 0;
        int somaLucros = 0;
        for (int i = 0; i < precos.length - 1; i++) {
            valorLucro = precos[i + 1] - precos[i];
            if (valorLucro > 0) {
                somaLucros += valorLucro;
            }
        }
        return somaLucros;
    }
}
