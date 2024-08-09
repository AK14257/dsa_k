import java.util.ArrayList;

public class prime{
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> primeNumbersTillN(int N) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                al.add(i);
            }
        }
        return al;
    }
    public static void main(String args[]){
        System.out.println(primeNumbersTillN(16));
    }
}