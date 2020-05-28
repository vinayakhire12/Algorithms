
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int[] table = new int[nums.length];
        int result = nums[0];
        table[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            table[i] = Math.max(nums[i], nums[i]+table[i-1]);
            result = Math.max(result, table[i]);
        }
        
        return result;
    }
