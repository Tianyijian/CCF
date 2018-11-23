package sellVeg20180901;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**存入list，进行计算即可。
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> price = new ArrayList<Integer>();
        for (int i=0; i < n;i++) {
            price.add(in.nextInt());
        }
        in.close();
        List<Integer> result = new ArrayList<Integer>();
        result.add((price.get(0) + price.get(1)) / 2);
        for (int i = 1; i < n - 1; i++) {
            result.add((price.get(i - 1) + price.get(i) + price.get(i + 1)) / 3);
        }
        result.add((price.get(n-2) + price.get(n-1)) / 2 );
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) +  " ");
        }
    }
}
