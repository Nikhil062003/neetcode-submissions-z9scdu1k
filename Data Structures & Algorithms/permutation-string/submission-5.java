class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[]= new int[256];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;

            
        }
        
        for(int i=0;i<s2.length();i++){
            if(freq[s2.charAt(i)-'a']!=0){
                // System.out.println("hi");
                if(i+s1.length()-1 < s2.length() && check(freq, s2.substring(i,i+s1.length()))){
                    return true;
                }
            }
        }





        return false;




    }
    public static boolean check(int freq[], String s2){
        // System.out.println(s2);
        int freq1[]= new int[256];


        for(int i=0;i<s2.length();i++){
            freq1[s2.charAt(i)-'a']++;
            // System.out.println(i);
        }
        for(int i=0;i<freq1.length;i++)
        {
            // System.out.println()
            if(freq[i]!=freq1[i]){
                return false;
            }
        }
            return true;
    }
}
