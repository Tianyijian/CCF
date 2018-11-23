package buyVeg20180902;

import java.util.Scanner;

/**使用数组time记录每个时间点出现的人次。
 * 遍历他们的到达时间，最终输出时间点出现两人的个数。
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h[][] = new int[2 * n][2];
        for (int i = 0; i < 2 * n; i++) {
            h[i][0] = in.nextInt();
            h[i][1] = in.nextInt();
        }
        in.close();
        int maxTime = h[n - 1][1] > h[2 * n - 1][1] ? h[n - 1][1] : h[2 * n - 1][1];
        int time[] = new int[maxTime];
        for (int i = 0; i < 2 * n; i++) {
            for (int j = h[i][0]; j < h[i][1]; j++) {
                time[j]++;
            }
        }
        int talk = 0;
        for(int i=0; i < maxTime; i++) {
            if(time[i] == 2) {
                talk++;
            }
        }
        System.out.println(talk);
    }

}
