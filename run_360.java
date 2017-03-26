import java.util.Scanner;
public class run_360 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        int R = s.nextInt();
        double deg = L/R;
        double x = R*Math.cos(deg);
        double y = R*Math.sin(deg);
        System.out.println(String.format("%.3f",x)+ " " + String.format("%.3f",y));
        System.out.println(String.format("%.3f",x)+ " " + String.format("%.3f",-y));
    }
}
