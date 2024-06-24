public class StringSearch {
    static boolean searchString(String s,char a){
        if(s.length()==0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(a==s.charAt(i)){
                return true;
            }

        }
        return false;
    }
    public static void main(String agrs[]){
        String s="abhishek kumar yadav is best";
        char a='z';
        boolean b = searchString(s, a);
        System.out.println(b);
    }
}
