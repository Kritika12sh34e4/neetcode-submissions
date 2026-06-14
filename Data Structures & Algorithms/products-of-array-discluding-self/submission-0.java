class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int m=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j)m*=nums[j];
            }
            a[i]=m;
        }
        return a;
    }
}  
