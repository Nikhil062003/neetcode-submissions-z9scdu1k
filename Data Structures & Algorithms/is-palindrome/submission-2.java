class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       String str = "";
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)!=' ' && (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) ){
         str += s.charAt(i)+"";}
       }
       String str1= "";
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=' ' && (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) ){
         str1 += s.charAt(i)+"";}
       }
    //    System.out.println(str+"  "+str1);
       return str.equals(str1) ? true:false;



        
    }
}
