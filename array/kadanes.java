public class kadanes {
    public static void kadanesSum(int numbers[]) {
        int ms = Integer.MIN_VALUE;  // maximum sum
        int cs = 0;  // current sum

        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];
            ms = Math.max(ms, cs);
            if (cs < 0) {
                cs = 0;
            }
        }
        System.out.println(ms);
    }

    public static void main(String args[]) {
        int arr[] = {1, -2, -3, 4, 5};
        kadanesSum(arr);
    }
}
