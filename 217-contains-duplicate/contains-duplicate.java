class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> seenNumbers= new HashSet<>();
        for(int num:nums)
        {
            if(seenNumbers.contains(num)) return true;
            seenNumbers.add(num);
        }return false;
    }
}