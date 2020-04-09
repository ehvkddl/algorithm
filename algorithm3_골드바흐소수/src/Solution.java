import java.util.Scanner;

public class Solution {
    public static int getPrime(int a){
        int count = 0, Num = a;
        for(int i = 1; i <= Num; i++){
            if (a % i == 0){
                count++;
            }
        }
        if(count == 2) {
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args){
        int inputNum[] = new int[20];
        int outputNum[][] = new int[20][2];
        int i, isPrime1 = 0, isPrime2 = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("입력할 수의 개수 : ");
        int n = s.nextInt();

        for(i = 0; i < n; i++){
            System.out.print("Input(n > 2): ");
            inputNum[i] = s.nextInt();
        }

        /*
        for(i = 0; i < n; i++){
            for(int j = 1; j < inputNum[i]; j++) {
                isPrime1 = getPrime(j);
                isPrime2 = getPrime(inputNum[i] - j);

                if(isPrime1 == 1 && isPrime2 == 1) {
                    outputNum[i][0] = j;
                    outputNum[i][1] = inputNum[i] - j;
                }
            }
        }

        for(i = 0; i < n; i++){
            System.out.println(inputNum[i] + " = " + outputNum[i][0] + " + " + outputNum[i][1]);
        }
        */

        for(i = 0; i < n; i++){
            int num = inputNum[i]/2;
            for(int j = num; j > 0; j--) {
                isPrime1 = getPrime(j);
                isPrime2 = getPrime(inputNum[i] - j);

                if(isPrime1 == 1 && isPrime2 == 1) {
                    outputNum[i][0] = j;
                    outputNum[i][1] = inputNum[i] - j;
                    break;
                }
            }
        }

        for(i = 0; i < n; i++){
            System.out.println(inputNum[i] + " = " + outputNum[i][0] + " + " + outputNum[i][1]);
        }

    }
}
