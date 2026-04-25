class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>newset=new HashSet<>();
        for(int num:nums){
            newset.add(num);
        }
        int longest=0;
        for(int num:nums){
            if(!newset.contains(num-1)){
                int length=1;
                while(newset.contains(num+length)){
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}
