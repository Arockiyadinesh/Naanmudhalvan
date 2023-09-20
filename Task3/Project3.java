class Project3{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }

            complementMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Solution twoSum = new Solution();
        int[] nums = {7, 4, 2, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
