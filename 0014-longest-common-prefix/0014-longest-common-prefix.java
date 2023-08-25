class Solution {
    public String longestCommonPrefix(String[] strs) {
       String ans=strs[0];
       for(int i=1;i<strs.length;i++){
           if(ans.length()==0){
               break;
           }
           String temp="";
           int j=0;int k=0;
           while(j<ans.length() && k<strs[i].length()){
               if(ans.charAt(j)==strs[i].charAt(k)){
                   temp=temp+Character.toString(ans.charAt(j));
               }
               else{
                   break;
               }
               j++;k++;
           }
           ans=temp;
       }
       return ans; 
    }
}