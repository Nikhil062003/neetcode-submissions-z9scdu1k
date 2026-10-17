class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i=0;
        int j=0;

        while( i<word.length() && j<abbr.length() ){
            char w = word.charAt(i);
            char a = abbr.charAt(j);
            

            if(Character.isDigit(a)){
                if(a=='0'){
                return false;}

                int num=0;
                
                
                while( j< abbr.length() && Character.isDigit(abbr.charAt(j))){
                     num = (Integer.parseInt(abbr.charAt(j)+""))+num*10;
                    j++;

                }
                System.out.println(num);
                i+=num;

        }
        else{
            if( w!= a){
                return false;
            }
            i++;j++;
        }
   
        }
        return word.length() == i && abbr.length() == j ;
        
        
        }}