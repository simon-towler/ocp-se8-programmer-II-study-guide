import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.Predicate;

class AnimalNamesBeginWithLetters {

   public static void main(String... args) {

     List<String> animals = Arrays.asList("monkey", "2", "chimp");
     Stream<String> infinite = Stream.generate( () -> "chimp" );
     Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
     System.out.println(animals.stream().anyMatch(pred)); // true
   }

}
