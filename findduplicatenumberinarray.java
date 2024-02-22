class Solution {
    public int findDuplicate(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int duplicate = 0;
      for (int num: nums) {
          if (map.containsKey(num)) duplicate = num;
          else map.put(num,1);
      }
      return duplicate;
    }
}
