import java.util.*;

public class LCSolutions {

    // 07. Reverse Integer
    protected int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) ? 0 : (int) reversed;
    }

    // 268. Missing Number
    protected int missingNumber(int[] nums) {
        int sumOfNums = 0, UpperLimit = nums.length + 1;

        for(int i : nums)
            sumOfNums += i;

        return ( ((UpperLimit * (UpperLimit + 1)) / 2) - sumOfNums );
    }

    // 1688. Count of Matches in Tournament
    protected int numberOfMatches(int n) {
        return n - 1;
    }

    // 2016. Maximum Difference Between Increasing Elements
    protected int maximumDifference(int[] nums) {
        int minVal = nums[0];
        int maxDiff = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minVal) {
                maxDiff = Math.max(maxDiff, nums[i] - minVal);
            } else {
                minVal = nums[i];
            }
        }

        return maxDiff;
    }

    // 3409. Longest Subsequence With Decreasing Adjacent Difference
    protected int longestSubsequence(int[] nums) {
        Map<Integer, Integer> dp = new HashMap<>();
        int maxLen = 0;

        for (int num : nums) {
            int len = dp.getOrDefault(num + 1, 0) + 1;
            dp.put(num, Math.max(dp.getOrDefault(num, 0), len));
            maxLen = Math.max(maxLen, dp.get(num));
        }

        return maxLen;
    }
}
