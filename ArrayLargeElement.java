public class ArrayLargeElement {

    static public int largestElement(int[] arr){
        int max = arr[0];
        for(int i = 1; arr.length > i; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {510226245, 3203, 832991, 2833364, 234234567};
        System.out.println(largestElement(arr));
    }
}
