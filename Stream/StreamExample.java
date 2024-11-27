package Stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<String> list = List.of("Hello", "hai", "lakshmana", "selvan");
        Stream<String> nameStream = list.stream();
        nameStream.forEach(System.out::println);
    }
}
