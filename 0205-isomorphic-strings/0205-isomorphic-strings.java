class Solution {
    public boolean isIsomorphic(String s, String t) {
       Boolean ans= true;
        HashMap<Character,Character> hm= new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i))!=t.charAt(i)){
                    ans=false;
                    break;
                }
                

            }
            else{
                if( hm.containsValue(t.charAt(i))){               
                    ans=false;
                    break;
                }
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return ans;
    }
}