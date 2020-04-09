import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        int coinType[]={1,5,10,50,100,500,1000,5000,10000,50000};
        int i, count = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("동전의 종류 : ");
        int N = s.nextInt();
        System.out.print("가치의 합 : ");
        int K = s.nextInt();

        for(i = 0; i < N; i++){
            System.out.println(coinType[i]);
        }

        for(i = 0; i < N - 1; i++) {
            if (K / coinType[N - 1 - i] > 0) {
                count += K / coinType[N - 1 - i];
                K = K - (coinType[N - 1 - i] * count);
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
