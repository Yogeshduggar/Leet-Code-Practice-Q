class Solution {
    public void swap(int[][] arr,int ox,int oy,int sx,int sy){
        int temp=arr[ox][oy];
        arr[ox][oy]=arr[sx][sy];
        arr[sx][sy]=temp;
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               arr[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}