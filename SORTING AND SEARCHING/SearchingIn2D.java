public class SearchingIn2D {
    static boolean search2d(int arr[][],int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};
        System.out.println(search2d(arr,7));
        }



}
