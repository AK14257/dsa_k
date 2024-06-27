public class EvenNoDigit {
    static int countDigit(int num){
        if(num<0){
            num=num*-1;
        }
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    static boolean isEven(int num) {
        if(num==0){
            return false;
        }
        int n=countDigit(num);
        if(n%2==0){
            return true;
        }
        return false;
    }

    static int noOfEven(int nums[]){
        int count=0;
        for(int num:nums){
            if(isEven(num)){
                count++;
            }

        }
        return count;
    }



    public static void main(String args[]){
     //   int x=0;
      //  int y=countDigit(x);
      //  System.out.println(isEven(x));
        int nums[]={0,0,-1,10};
        System.out.println(noOfEven(nums));


    }
}
