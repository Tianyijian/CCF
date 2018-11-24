package jump20180301;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> score = new ArrayList<Integer>();
        int i = 0;
        while((i = sc.nextInt()) != 0) {
            score.add(i);
        }
        sc.close();
        int sum = 0;
        int num2 = 0;   //记录2出现的次数
        for (int j = 0; j < score.size(); j++) {
            if (score.get(j) == 1) {
                sum += 1;
                num2 = 0;
            } else if (score.get(j) == 2) {
                if (j == 0) {
                    sum += 2;
                    num2 = 1;
                } else if (score.get(j - 1) == 1){
                    sum += 2;
                    num2 = 1;
                } else if (score.get(j - 1) == 2) {
                    num2 +=1 ;
                    sum += 2 * num2;
                }
            }
        }
        System.out.println(sum);
    }
}
