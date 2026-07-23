class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ls = new HashSet<>();

        for(int i=0;i<nums.length;i++){
           
            check(nums[i], i+1, nums, ls);
        }
        return  new ArrayList(ls);
        
    }
    public static void check(int val, int ind, int[] nums, HashSet<List<Integer>>  ls){
        int i=ind;
        int j=nums.length-1;
        

        while(i<j){
            
            if(nums[i]+nums[j]+val == 0){
                List<Integer> cur = new ArrayList<>();
                // System.out.println(cur);
                cur.add(nums[i]);
                cur.add(nums[j]);
                cur.add(val);
                ls.add(cur);

            }
            if(nums[i]+nums[j]+val > 0 ){
                j--;
            }
            else{
                i++;
            }
        }
    }
}
