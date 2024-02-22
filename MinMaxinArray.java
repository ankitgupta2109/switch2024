public class MinMax {
    public void findMinMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num: nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println(min)
        System.out.println(max)
    }
}
