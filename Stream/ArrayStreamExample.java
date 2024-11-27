package Stream;

import java.util.Arrays;

public class ArrayStreamExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
