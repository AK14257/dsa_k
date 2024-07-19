public class Largest_Number {
    public static int Find_Largest(int num[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,2,24,2,41};
        System.out.println(Find_Largest(arr));
    }

}
