import java.util.Arrays;
import java.util.Scanner;

;public class Input{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr= new int[5];
        arr[0]=23;
        arr[1]=2;
        arr[2]=98;
        arr[3]=778;
        arr[4]=45;
        System.out.println(arr[3]);

        for(int i=0;i<arr.length;i++){
            System.out.println("enter the element on postion :"+ (i+1));
            arr[i]=in.nextInt();
        }


      
        for(int num:arr){
            System.out.println(num+" ");

        }

        System.out.println(Arrays.toString(arr));

    }
}