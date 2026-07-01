class Solution {
    public int lengthOfLongestSubstring(String s) {

       int i=0,j=0;
       HashSet<Character> S = new HashSet<>();
       int max = Integer.MIN_VALUE;
      
       while(j<s.length()){

             while( S.contains(s.charAt(j))){
                max = Math.max(max, S.size());
                S.remove(s.charAt(i));
                i++;


             }
              S.add(s.charAt(j));
              j++;
             

        

       }
       return Math.max(max, S.size());
        
    }
}
