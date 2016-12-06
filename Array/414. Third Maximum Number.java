public class Solution {
    public final int N = 3;
    public int thirdMax(int[] nums) {
        if (nums.length == 0) return 0;

        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) continue;
            if (set.size() < N || nums[i] > set.first()) {
                if (set.size() == N) set.remove(set.first());
                set.add(nums[i]);
            }
        }
        return set.size() == N ? set.first() : set.last();
    }
}