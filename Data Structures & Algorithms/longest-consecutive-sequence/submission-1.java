class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> H= new HashSet<>();
        for(int i=0;i<nums.length;i++){H.add(nums[i]);}

        int max= Integer.MIN_VALUE;
        
        

        for(int j=0;j<nums.length;j++){
            if(!H.contains(nums[j]-1)){
                int k=0;
                int length=0;
                while(H.contains(nums[j]+k)){
                    k++;
                    length++;
                }
            max= Math.max(length,max);

            }
        }
        return max==Integer.MIN_VALUE? 0: max;
        
    }
}
