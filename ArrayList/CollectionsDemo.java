import java.util.*;

public class CollectionsDemo {
    public static void main(String args[]) {


        List<Integer> list = new ArrayList<Integer>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //System.out.println(list);
        //Iterator<Integer> it=list.iterator();
        //while (it.hasNext()){{
        //    System.out.println(it.next());
        //}}
        //for(Integer value:list){
        //    System.out.println(value);
        //}
        Set<Integer> set=new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);


        set.add(10);
        System.out.println(set);

}}
