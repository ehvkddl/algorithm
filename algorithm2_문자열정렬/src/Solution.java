import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        String[] str = new String[50];
        //String[] compare = new String[50];

        System.out.print("입력할 단어의 수 : ");
        Scanner s = new Scanner(System.in);
        int wordNum = s.nextInt();

        for(int i = 0; i < wordNum; i++) {
            System.out.print("단어를 입력하세요 : ");
            String word = s.next();
            str[i] = word;
        }

        System.out.print("정렬하고 싶은 글자의 인덱스 : ");
        int indexNum = s.nextInt();

        for(int i = 0; i < wordNum; i++){
            str[i] = str[i].charAt(indexNum) + str[i];  //문장중에 인덱스 위치에 해당되는 문자 추출
        }


        for(int i = 0; i < wordNum; i++){
            for(int j = i; j < wordNum; j++){
                int cmpResult = str[i].compareTo(str[j]);  //문자열 같으면 0, 크면 양수, 작으면 음수
                if (cmpResult > 0){
                    String temp = str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }

        for(int i = 0; i < wordNum; i++){
            str[i] = str[i].substring(1, str[i].length());
        }

        for(int i = 0; i < wordNum; i++)
            System.out.println(str[i]);

    }
}
