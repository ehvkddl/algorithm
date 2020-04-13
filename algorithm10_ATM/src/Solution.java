public class Solution {
    public static void main(String args[]){
        int people = 5;
        int time[] = {3, 1, 4, 3, 2};

        int i, j, sum = 0, result = 0;

        for(i = 0; i < people; i++){
            for (j = 0; j < people-i-1; j++){
                if (time[j]>time[j+1]){
                    int temp = time[j+1];
                    time[j+1] = time[j];
                    time[j] = temp;
                }
            }
        }

        for (i = 0; i <people; i++) {
            System.out.print(time[i] + " ");
        }
        System.out.println();

        for (i = 0; i < people; i++){
            for (j = 0; j <= i; j++){
                sum += time[j];
            }
            result += sum;
            sum = 0;
        }
        System.out.println(result);
    }

}
