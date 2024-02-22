class Solution {
    public void findDuplicate(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int duplicate = 0;
      for (int num: nums) {
          if (map.containsKey(num)) map.put(num, map.get(num)+1);
          else map.put(num,1);
      }
      for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
        if (entry.getValue()==2) System.out.println(entry.getKey())
      }
    }
}
