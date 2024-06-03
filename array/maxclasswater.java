import java.util.*;
public class maxclasswater{
    public static int maxholding(ArrayList<Integer> list){
        int max=0;
        int lp=0;
        int hp=list.size()-1;
        while(lp<hp){
            int height=Math.min(list.get(lp),list.get(hp));
            int width=hp-lp;
            int area=height*width;
            max=Math.max(area,max);
            if(list.get(lp)<list.get(hp)){
                lp++;
            }
            else{
                hp--;
            }

        }
        return max;

    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maxholding(list));
    }
}