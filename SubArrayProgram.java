public class SubArrayProgram {
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int num : arr) {
            currentMax += num;
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
            if (currentMax < 0) {
                currentMax = 0;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Maximum Subarray Sum (arr1): " + maxSubArraySum(arr1));
    }
}
