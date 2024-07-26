public class subarray {
    public static void subarrays(int arr[]){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                if(max<sum){
                    max=sum;
                }
            }

        }
        System.out.println("maximum sum ="+max);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        subarrays(arr);
    }
}
