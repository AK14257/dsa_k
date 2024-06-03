import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListOp {
    public static <Arraylist> void main(String args[]) {
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);

        //REMOVE ELEMENT
        list.remove(5);
        System.out.println(list);


        //Getting element
        System.out.println(list.get(2));

        //SIZE
        System.out.println(list.size());

        //containg element or not
        System.out.println(list.contains(30));

        //set element
        System.out.println(list.set(2,60));
        System.out.println(list);

        //Sorting
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);



    }
    }

