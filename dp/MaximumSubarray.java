class MaximumSubarray 
{
    public int maxSubArray(int[] nums) 
    {
        int max=0,s;
        int a[n];
        for(int i=0;i<n;i++)
        {   
            s=0;
            for(int j=i;j<n;j++)
            {
                if((s+a[j])>=s)
                {
                    s=s+a[j];
                    max=max+s;
                }
            }
        }   
    }
}