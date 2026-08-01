class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max =Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max= Math.max(max, piles[i]);
        }
        
        int l=1;
        int r=max;
        int min =Integer.MAX_VALUE;
        while(l<=r){
            int mid = l+(r-l)/2;
            boolean possible_ans = check(mid, piles,h);
            if(possible_ans){
            min = Math.min(mid,min);
            r=mid-1;
            
            }else{
                l=mid+1;
            }

        }
        return min;
    }
    public static boolean check(int ele, int piles[], int h){
        int eat =0;

        for(int i=0;i<piles.length;i++){

            eat += Math.ceil((piles[i]+0.0)/ele);
        }
        if(eat<= h){
            return true;
        }
        return false;


    }
}
