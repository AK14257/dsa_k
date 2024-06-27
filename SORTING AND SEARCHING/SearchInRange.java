public class SearchInRange {
    static boolean LinearSearchaglo(int arr[],int target,int start,int end){
        if(arr.length==0){
            return false;
        }else{
            for(int i=start;i<=end;i++){
                if(arr[i]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String arg[]){
        int[] arr={1000,200,2304,3420,234};
        boolean i = LinearSearchaglo(arr, 1000,1,3);
        System.out.println(i);

    }

}
