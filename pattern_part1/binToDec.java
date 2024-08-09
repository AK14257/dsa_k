public class binToDec {
    public static void bintodecc(int n){
        int pow=0;
        int decNum=0;
        while(n>0){
            int lastDigit = n%10;
            decNum=decNum+(lastDigit * (int)Math.pow(2,pow));

            pow++;
            n=n/10;
        }
    System.out.println(decNum);
    }

    public static void DecToBin(int n){
        int pow=0;
        int binNum=0;
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem * (int)(Math.pow(10,pow)));
            pow++;
            n=n/2;



        }
        System.out.println(binNum);
    }

    public static  void main(String args[]){
        DecToBin(7);
    }
}
