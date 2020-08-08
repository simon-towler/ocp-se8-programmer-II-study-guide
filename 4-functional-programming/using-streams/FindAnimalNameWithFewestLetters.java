import java.util.stream.Stream;
import java.util.Optional;

class FindAnimalNameWithFewestLetters {
    public static void main(String... args) {

        //stream of names as input
        Stream<String> names = Stream.of("monkey", "ape", "bonobo");

        Optional<String> min = names.min(
                (names1, names2) -> names1.length() - names2.length()
        );

        min.ifPresent(System.out::println);
    }
}