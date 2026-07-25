class Solution {
    public boolean isValid(String s) {
        Stack<Character> S = new Stack<>();

        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='[' || a=='{' || a=='('){
                S.push(a);
            }
            else{
                if(S.isEmpty()){
                    return false;
                }
                char top = S.peek();
                if( (a==']' && top =='[') || 
                    (a==')' && top =='(') ||
                    (a=='}' && top =='{')
                    ){
                        S.pop();

                    }
                    else{
                        return false;
                    }
            }
           
        }
        return S.isEmpty();
        
    }
}
