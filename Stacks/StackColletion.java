import java.util.*;
public class StackColletion {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while (idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        System.out.println(result);
        String str1=result.toString();
        System.out.println(str1.toCharArray());
        return str1;

    }
    public static void main(String args[]){
       // Stack<Integer> s=new Stack<>();
       // s.push(10);
       // s.push(20);
       // s.push(30);
       // pushAtBottom(s,4);
       // System.out.println(s);
        String str="abc";
        System.out.print(reverseString(str));




    }

}
