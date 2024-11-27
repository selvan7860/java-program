import java.util.ArrayList;
import java.util.List;

public class MergeArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> r = new ArrayList<>();
        for(int num : nums1){
            r.add(num);
        }
        for(int num1 :  nums2){
            r.add(num1);
        }
        int[] c = r.stream().mapToInt(Integer::intValue).sorted().toArray();
        int length = c.length;

        if (length % 2 == 0){
            return (c[length / 2 - 1] + c[length / 2]) / 2;
        }
        else {
            return c[length / 2];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 10};
        int[] b = {30, 20, 50};
        System.out.println(findMedianSortedArrays(a, b));
    }
}
