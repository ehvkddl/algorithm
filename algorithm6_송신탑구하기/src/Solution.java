import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        int i, j;
        ArrayList<Integer> tower = new ArrayList();
        ArrayList<Integer> receive = new ArrayList();
        receive.add(0, 0);

        Scanner s = new Scanner(System.in);
        System.out.print("탑의 개수 : ");
        int towerNum = s.nextInt();

        for(i = 0; i < towerNum; i++){
            System.out.print( (i+1) + "번 탑의 높이 : ");
            int towerHeight = s.nextInt();
            tower.add(i, towerHeight);
        }



        for(i = 1; i < towerNum; i++){
            for(j = i-1; j >= 0; j--){
                if(tower.get(i) < tower.get(j)){
                    receive.add(i,j+1);
                    break;
                }
                else if(j == 0)
                    receive.add(i, 0);
            }
        }

        System.out.println("heights " + tower);
        System.out.println("return  " + receive);

    }
}
