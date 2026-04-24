class Solution {
    public boolean isAnagram(String s, String t) {

        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);
        String str1 = String.valueOf(ch1);

        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        String str2 = String.valueOf(ch2);

        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}
