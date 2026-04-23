class Solution {
    public int trap(int[] arr) {
       
     int left[] = new int[arr.length];
     left[arr.length-1] = arr[ arr.length-1];
     int curmax = left[arr.length-1];
     
 
     for(int i=arr.length-2;i>=0;i--){
        left[i]= Math.max(arr[i], left[i+1]);
        // System.out.println(left[i]);

     }
     int right[]=new int [arr.length];
     right[0]=arr[0];

     for(int i=1;i<arr.length;i++){
        right[i]= Math.max(arr[i],right[i-1]);

     }
    int ans = 0;

     for(int i=0;i<arr.length;i++){
        System.out.println(left[i]+" "+ right[i] +" " +arr[i]);
        ans += Math.min(left[i],right[i])-arr[i];
        
        

     }

     return ans;


        
    }
}
