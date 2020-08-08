import java.util.stream.Stream;
import java.util.Optional;

class FindAnimalNameWithFewestLetters {
    public static void main(String... args) {

        //stream of names as input - note a null would cause an NPE
        Stream<String> names = Stream.of("mono", "monkey", "cat", "bonobo", "ape");

        /*
        The signature of min() is Optional<T> min(Comparator <? super T> comparator)
        In other words, it takes a Comparator and returns an Optional.
        (Note that Comparators are for deciding an ordering, not for determining mins and maxes.)
         */
        Optional<String> min = names.min(
                //comparator function
                (names1, names2) -> names1.length() - names2.length()
                /*
                So, if the result of the comparator function is more than 0, names1 is kept
                otherwise names2 becomes the new names1. Then ultimately the final names1 is returned.
                Q: What is returned if there is more than one name of the same minimum length?
                A: The first one met, because none of the subsequent ones cause a greater-than result.

                This illustrates that it is the Comparator function given that governs what min and max return.
                If you were to transpose names1 & names2 in it, the longest name, "monkey" would be returned instead.
                 */
        );

        /*
        min() returns an Optional to allow for the case where no min or max is found.
        This would be the case for an empty stream.
         */
        min.ifPresent(System.out::println); // prints "cat"
    }
}