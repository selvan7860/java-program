import java.util.HashMap;
import java.util.HashSet;

public class PairWithArray {

    static public boolean hasPairWithDifferent(int[] arr, int a){
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr){                //{5, 20, 3, 2, 5, 80}
            if(set.contains( num - a ) || set.contains(num + a)){
                return true;
            }
            set.add(num);
        }
        return  false;
    }

    static public void main(String[] args) {
        int[] arr = {5, 80, 3, 2, 5, 20};
        int a = 60;
        boolean result = hasPairWithDifferent(arr, a);
        System.out.println(result);

        int[] arr1 = {90, 70, 20, 80, 50};
        int a1 = 45;
        boolean result1 = hasPairWithDifferent(arr1, a1);
        System.out.println(result1);
    }

}
