class Solution {
    public int singleNumber(int[] nums) {
    int c=0;
    for(int i=0;i<nums.length;i++){
        boolean found=false;
        for(int j=0;j<nums.length;j++){
            if(i!=j&& nums[i]==nums[j]){
                found=true;
            }
        }
        if(found==false){
            c=nums[i];
        }
    }
    return c;
    }
}