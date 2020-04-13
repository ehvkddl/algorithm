public class Solution {
    public static void main(String args[]){
        int coin[] = {500, 100, 50, 10, 5, 1};
        int taro = 1000;
        int price = 380;
        int i, coinNum = 0;


        int change = taro - price;

        i = 0;
        while (change > 0) {
            coinNum += change / coin[i];
            change = change - coin[i] * (change / coin[i]);
            i++;
        }
        System.out.println(coinNum);
    }
}
