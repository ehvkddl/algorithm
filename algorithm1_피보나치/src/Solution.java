import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        int sum = 0;
        int arr[] = new int[20];
        arr[0] = 0;
        arr[1] = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력 (0 <= n <= 20) : ");
        int num = scanner.nextInt();

        for(int i = 1; i < num; i++ ){
            arr[i+1] = arr[i-1] + arr[i];
        }


        System.out.println(arr[num]);


    }
}
