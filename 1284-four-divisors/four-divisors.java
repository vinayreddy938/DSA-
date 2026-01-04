class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int count = 0;
            int sum = 0;

            for (int j = 1; j * j <= number; j++) {
                if (number % j == 0) {
                    int d1 = j;
                    int d2 = number / j;

                    sum += d1;
                    count++;

                    if (d1 != d2) {
                        sum += d2;
                        count++;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                totalSum += sum;
            }
        }
        return totalSum;
    }
}
