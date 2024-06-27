public class maxWealth {
    public static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int rowSum=0;
            for(int account=0;account<accounts[person].length;account++){
                rowSum+=accounts[person][account];
            }

            if(rowSum>ans){
                ans=rowSum;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[][]={{12,32,4210},{123,4112,22}};
        int ans=maximumWealth(arr);
        System.out.println(ans);

    }

}


