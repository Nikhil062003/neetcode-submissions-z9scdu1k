class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> S = new Stack ();
        for(int i=0;i<tokens.length;i++){
            String st = tokens[i];
            if( (!st.equals("*") && !st.equals("-") 
                 && !st.equals("+") && !st.equals("/")
                 )
               ){
                System.out.println(st);
                S.push(st);
            }else{
                int a = Integer.parseInt(S.pop());
                int b= Integer.parseInt(S.pop());
                System.out.println(a+":a , b: "+b +" st "+st);
                
                int ans =0;
                if(st.equals("+")){
                    ans = a+b;
                    
                }else if( st.equals("-")){
                    ans = b-a;
                }else if(st.equals("*")){
                    ans = b*a;
                }else{
                    ans = b/a;
                }
                System.out.println(S+ " "+ ans);
                S.push(ans+"");
            }
        }
        System.out.println(S);
        return Integer.parseInt(S.pop());

        
    }
}
