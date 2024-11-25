import java.util.HashMap;

public class DuplicateCounte {


    public  static  int ArrayChallenge(int[] arr){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int duplicateCount = 0;
        for(int num : arr){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int count : frequencyMap.values()){
            if(count > 1){
                duplicateCount += (count - 1);
            }
        }
        return duplicateCount;
    }

    public static void main(String[] args) {
        int[] varOcg = {0, -2, -2, 5, 5, 5}; // __define-ocg__: Example input array
        System.out.println(ArrayChallenge(varOcg)); // Output should be 3

        int[] testInput = {100, 2, 101, 4};
        System.out.println(ArrayChallenge(testInput)); // Output should be 0
    }
}
