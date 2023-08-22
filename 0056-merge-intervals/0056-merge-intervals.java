class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=arr[i-1][1]){
                arr[i][1]=Math.max(arr[i][1],arr[i-1][1]);
                arr[i][0]=arr[i-1][0];
                arr[i-1][0]=-1;
                arr[i-1][1]=-1;
                n--;
            }
        }
        int[][] ans =new int[n][2];
        int in=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]!=-1){
                ans[in]=arr[i];
                in++;
            }
        }
        return ans;
    }
}