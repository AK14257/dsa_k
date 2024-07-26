public class ReverseArray {
    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;

        }
    }
    public static void main(String args[]){
        int arr[]={1,23,124,24213,21};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
