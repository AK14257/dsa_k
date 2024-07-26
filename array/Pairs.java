public class Pairs {
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=i;
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+arr[curr]+", "+arr[j]+")");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={12,312,24,21,124};
        pair(arr);
    }
}
