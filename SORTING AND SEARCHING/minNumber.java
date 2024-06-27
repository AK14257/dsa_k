public class minNumber {
    static int minFind(int arr[]){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String arg[]){
        int[] arr={1000,200,2304,3420,234,-4};
        System.out.println(minFind(arr));
    }
}
