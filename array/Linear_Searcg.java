public class Linear_Searcg {
    public static boolean linear_Search(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return true;
            }

        }
        return false;
        }

    public static void main(String agrs[]){
        int marks[]={10,2,3,21,34};
        int key=0;
        System.out.println(linear_Search(marks,key));

    }

}
