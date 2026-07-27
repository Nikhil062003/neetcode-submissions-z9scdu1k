class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> S= new Stack<>();
        int ans[]= new int[temp.length];
        ans[temp.length-1]=0;

        S.push(temp.length-1);
        for(int i=temp.length-2;i>=0;i--){
            while(!S.isEmpty() && temp[i] >= temp[S.peek()] ){
                S.pop();
            }
            if(S.isEmpty()){
                ans[i]= 0;
            }
            else{
               ans[i]= S.peek()-i;
            }
            S.push(i);
        }
        return ans;

         
        
    }
}
