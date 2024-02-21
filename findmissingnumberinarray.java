class MissingNumber {
    
    static int findMissingNumber (int[] arr) {
      int length = arr.length;
      int sum = (length * (length +1))/2;
      int actualSum = 0;
      for (int num : arr) {
          actualSum += num;
      }
      return sum - actualSum;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i=0;i<100;i++) {
            if (i == 25) {
                arr[i] = 0;
                continue;
            }
            arr[i] = i+1;
        }
        System.out.println(findMissingNumber(arr));
    }
}
