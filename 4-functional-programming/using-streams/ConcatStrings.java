import java.util.stream.Stream;
import java.util.TreeSet;

class ConcatStrings {
   public static void main(String... args) {
     Stream<String> stream = Stream.of("w", "o", "l", "f");

     // different logic for acculator and combiner this time
     TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll); // supplier, accumulator, combiner
     System.out.println(set); // [f, l, o, w]
   }

}
