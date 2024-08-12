public class advpattern3 {
    public static void halfnumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                 System.out.print(j+ " ");
            }
            System.out.println();
        }

    }

    public static void floydpatter(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floydpatter(5);
    }
}
