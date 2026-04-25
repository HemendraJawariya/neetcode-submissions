class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int left=0;
        int result=1;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while((right-left+1)*nums[right]-sum>k){
                sum-=nums[left];
                left++;
            }
            result=Math.max(right-left+1,result);
            
        }

            return result;
    }
}