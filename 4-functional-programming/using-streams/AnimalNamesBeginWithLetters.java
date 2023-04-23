import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.Predicate;

class AnimalNamesBeginWithLetters {

   public static void main(String... args) {

     List<String> animals = Arrays.asList("monkey", "2", "chimp");
     Stream<String> infinite = Stream.generate( () -> "chimp" ); // generates an infinite stream of "chimp"
     Predicate<String> pred = x -> Character.isLetter(x.charAt(0)); // element starts with a letter
     // we can reuse the predicate, but we need a new stream each time
     System.out.println(animals.stream().anyMatch(pred)); // true, because at least one does
     System.out.println(animals.stream().allMatch(pred)); // false, because at least one doesn't
     System.out.println(animals.stream().noneMatch(pred)); // false, because at least one does
     System.out.println(infinite.anyMatch(pred)); // true, because at least one element does
   }

}
