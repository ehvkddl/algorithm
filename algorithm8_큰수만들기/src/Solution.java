import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String result(int intarr[], int sortarr[], int i, int count, int size, int k) {
        String answer = "";
        for (i = i; i < intarr.length; i++) {
            if (sortarr[count] == intarr[i]) {
                if (i < size - k + count) {
                    count++;
                    answer += Integer.toString(intarr[i]);
                } else {
                    count++;
                }
            }
        }
        return answer;
    }



    public String solution(String number, int k) {
        String answer = "";

        int i, j;
        int mot = 10;
        int size = number.length();
        String arr[] = new String[size];
        int intarr[] = new int[size];

        arr = number.split("");

        for (i = 0; i < arr.length; i++) {
            intarr[i] = Integer.parseInt(arr[i]);
        }

        int[] sortarr = Arrays.copyOf(intarr, intarr.length);

        for (i = 0; i < sortarr.length - 1; i++) {
            for (j = 0; j < sortarr.length - 1 - i; j++) {
                if (sortarr[j] < sortarr[j + 1]) {
                    int temp = sortarr[j + 1];
                    sortarr[j + 1] = sortarr[j];
                    sortarr[j] = temp;
                }
            }
        }

        int count = 0;
        i = 0;
        while(true) {
            for (i = 0; i < intarr.length; i++) {
                if (sortarr[count] == intarr[i]) {
                    if (i < size - k) {
                        count++;
                        answer += Integer.toString(intarr[i]);
                        for (i = i + 1; i < intarr.length; i++) {
                            if (sortarr[count] == intarr[i]){
                                if (i < size - k + 1) {
                                    count++;
                                    answer += Integer.toString(intarr[i]);
                                    for (i = i + 1; i < intarr.length; i++ ){

                                    }
                                } else {
                                    count++;
                                }
                            }
                        }

                    } else {
                        count++;
                    }
                }
            }
        }


        for (i = 0; i < intarr.length-k; i++){
            answer += Integer.toString(intarr[i]);
        }

        return answer;
    }


    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.solution("1924", 2));
        System.out.println(s.solution("1231234", 3));
        System.out.println(s.solution("4177252841", 4));



//        String number = "1231234";
//        int k = 3;
//        String answer = "";
//
//        int i, j;
//        int mot = 10;
//        int size = number.length();
//        String arr[] = new String[size];
//        int intarr[] = new int[size];
//
//        arr = number.split("");
//
//        for (i = 0; i < arr.length; i++) {
//            intarr[i] = Integer.parseInt(arr[i]);
//        }
//
//        for (i = 0; i < intarr.length - 1; i++) {
//            for (j = 0; j < intarr.length - 1 - i; j++) {
//                if (intarr[j] < intarr[j + 1]) {
//                    int temp = intarr[j + 1];
//                    intarr[j + 1] = intarr[j];
//                    intarr[j] = temp;
//                }
//            }
//        }
//
//        for(i = 0; i < intarr.length; i++) {
//            System.out.println(intarr[i]);
//        }
//
//        for (i = 0; i < intarr.length-k; i++){
//            answer += Integer.toString(intarr[i]);
//        }
    }
}
