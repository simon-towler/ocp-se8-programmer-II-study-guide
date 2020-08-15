import java.util.stream.Stream;
import java.util.TreeSet;
import java.util.stream.Collectors;

class ConcatStrings {
   public static void main(String... args) {
     Stream<String> stream = Stream.of("w", "o", "l", "f");

     // leveraging Collectors interface
     TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
     System.out.println(set); // [f, l, o, w]
   }

}
