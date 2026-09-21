public class Solution {
    public int[] twoSum(int[] arr, int x) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==x){
                return new int[]{left+1,right+1};
            }
            else if(sum>x){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1}; 
    }
}