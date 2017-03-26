/**
 * Created by user on 2017/3/26.
 */
import java.util.Arrays;
import java.util.Scanner;
public class CutBalloonString_360 {
    static final int MOD = (int)1e9 + 7;
    static int CutBallStirng (int[] color,int n) {
        int[] count = new int[11];
        int[] result = new int[100009];
        result[0] = 1;
        for(int i = 1; i<=n; i++) {
            Arrays.fill(count, 0);
            for(int j = 0; j<i; j++){
                count[color[i-j-1]] ++;
                if(count[color[i-j-1]] > 1) {
                    break;
                }
                result[i] = (result[i] + result[i-j-1])% MOD;
            }
        }
        return result[n];
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] test = new int[n];
        for(int i = 0; i < n; i++){
            test[i]= s.nextInt();
        }
        System.out.println(CutBallStirng(test,n));
    }
}