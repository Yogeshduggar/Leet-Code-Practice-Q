class Solution {
    public String largestOddNumber(String num) {
        int n= num.length();
        int in=-1;
        for(int i=0;i<n;i++){
            int j=Character.getNumericValue(num.charAt(i));
            if(j%2!=0){
                in=i;                
            }
        }
        if(in==-1){
            String ar="";
            return ar;
        }
    return num.substring(0,in+1);
    }

}