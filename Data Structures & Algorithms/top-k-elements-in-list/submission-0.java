class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> H= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(H.containsKey(nums[i])){
               H.put(nums[i],H.get(nums[i])+1);
            }else{
                H.put(nums[i],1);
            }
        }
        //System.out.println(H);
        PriorityQueue<Integer> P= new PriorityQueue<>((a,b)->H.get(b) - H.get(a));
        P.addAll(H.keySet());
        int arr[]= new int[k];
        // System.out.println(P);
        int i=0;
        
        while( k-->0){

            arr[i]=P.poll();
            i++;
        }
       // System.out.println(P);
        return arr;
    }
}
