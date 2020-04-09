public class Solution {
    public static void main(String[] args) {
//        int n = 5;
//        int[] lost = {2, 4};
//        int[] reserve = {1, 3, 5};

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};



        int i, j;
        int answer = 0;

        int[] student = new int[n];

        for(i = 0; i < n; i++){
            student[i] = 1;
            for (j = 0; j < lost.length; j++){
                if (i+1 == lost[j]){
                    student[i] -= 1;
                }
            }
            for (j = 0; j < reserve.length; j++){
                if (i+1 == reserve[j]){
                    student[i] += 1;
                }
            }
        }


        for (i = 0; i < n; i++) {
            System.out.print(student[i]+" ");
        }
        System.out.println();



//        i = 0;
//        while (i < n){
//            j = i+1;
//            if (student[i] == 2 && student[j] == 0){
//                student[i] -= 1;
//                student[j] += 1;
//            }
//            i++;
//        }
//
//        i = 4;
//        while (i >= 0){
//            j = i-1;
//            if (student[i] == 2 && student[j] == 0){
//                student[i] -= 1;
//                student[j] += 1;
//            }
//            i--;
//        }

        for(i = 1; i < n; i++){
            if (student[i] == 0) {
                if (student[i] == 2 && student[i - 1] == 0) {
                    student[i] -= 1;
                    student[i - 1] += 1;
                } else if (student[i] == 2 && student[i + 1] == 0) {
                    student[i] -= 1;
                    student[i + 1] += 1;
                }
            }
        }

        for(i = 0; i < n; i++){
            if (student[i] >= 1) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}
