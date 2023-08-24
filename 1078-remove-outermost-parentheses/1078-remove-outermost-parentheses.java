class Solution {
public String removeOuterParentheses(String s) {
    int n = s.length();
    StringBuilder ans = new StringBuilder();
    int count = 0;
    
    for (int i = 0; i < n; i++) {
        char c = s.charAt(i);
        
        if (c == '(') {
            if (count > 0) {
                ans.append(c);
            }
            count++;
        } else if (c == ')') {
            count--;
            if (count > 0) {
                ans.append(c);
            }
        }
    }
    
    return ans.toString();
}

}
