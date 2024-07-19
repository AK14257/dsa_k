public class Binary_Search {
    public static boolean BinaryS(int num[],int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start + end)/2;
            if(num[mid]==key){
                return true;
            }
            if(num[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int marks[]={1,2,3,4,5,6};
        int key=10;
        System.out.println(BinaryS(marks,key));

    }
}
