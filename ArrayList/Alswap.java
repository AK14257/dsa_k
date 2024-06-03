import java.util.ArrayList;

public class Alswap {
    static void Swap(ArrayList<Integer> arr,int ind1,int ind2){
        int temp= arr.get(ind1);
        arr.set(ind1,arr.get(ind2));
        arr.set(ind2,temp);

    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        Swap(list,0,2);
        System.out.println(list);
    }

}
