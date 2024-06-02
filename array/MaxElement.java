import java.util.ArrayList;

public class MaxElement {
    static void MaxElement(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max= list.get(i);
            }

    }
        System.out.println(max);


    }

    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        MaxElement(list);
    }

}
