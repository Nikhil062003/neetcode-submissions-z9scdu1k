class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum =1;int count=0;

        for(int i=0;i<nums.length;i++){
            if( nums[i] == 0 ){
                count++;
                continue;
            }
            sum *= nums[i];
            
        }
        System.out.println(sum);
        if(count>=2){
            return new int[nums.length];
        }
        for(int i=0;i<nums.length;i++){
            if(count == 1 && nums[i] != 0 ){
                nums[i]=0;
                continue;
            }


            if(nums[i]==0){
                nums[i]=sum;
                continue;
            }
            nums[i]=sum/nums[i];
        }
        return nums;
       
    }
}  
