class Solution 
{
    public int maxSubArray(int[] nums) 
    {
 
        int a = nums[0], b = 0, max = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            b = Math.max(nums[i], (a + nums[i]));
            max = Math.max(b, max);
            a = b;
        }
        return max;
    }
}