import java.util.*;

public class Trib {

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1 || n == 2) {
            return 1;
        }

        int F = 0, S = 1, T = 1;

        for (int i = 3; i <= n; i++) {
            int Four = F + S + T;
            F = S;
            S = T;
            T = Four;
        }

        return T;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Trib obj = new Trib();
        System.out.println(obj.tribonacci(n));
    }
}