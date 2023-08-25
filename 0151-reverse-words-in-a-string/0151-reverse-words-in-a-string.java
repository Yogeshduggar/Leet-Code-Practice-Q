class Solution {
    public String reverseWords(String s) {
        int i = s.length() - 1;
        StringBuilder ans = new StringBuilder();
        boolean wordAdded = false; // To track if a word has been added
        
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            int j = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if (j > i) {
                if (wordAdded) {
                    ans.append(" ");
                }
                ans.append(s.substring(i + 1, j + 1));
                wordAdded = true;
            }
        }
        
        return ans.toString();
    }
}
