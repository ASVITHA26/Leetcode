class Solution {
    public int minMoves2(int[] nums) {
        int m=0;
        Arrays.sort(nums);
        int s=nums[nums.length/2];
        for(int n:nums){
            m+=Math.abs(n-s);
        }
        return m;
    }
}