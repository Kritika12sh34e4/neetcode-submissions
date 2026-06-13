class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int needed = target - nums[index];

            if (seen.containsKey(needed)) {
                return new int[]{ seen.get(needed), index };
            }

            seen.put(nums[index], index);
        }

        return new int[]{};
    }
}