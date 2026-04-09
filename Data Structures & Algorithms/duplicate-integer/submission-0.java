class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> H = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(H.containsKey(nums[i])){
                //System.out.println(nums[i]);
                return true;
            }
            H.put(nums[i], H.getOrDefault(nums[i],0)+1);
        }
        return false;
        
    }
}