public class LinearSearch {
    static int LinearSearchaglo(int arr[],int target){
        if(arr.length==0){
            return -1;
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int[] arr={1000};
        int i = LinearSearchaglo(arr, 1000);
        System.out.println(i);

    }

}
