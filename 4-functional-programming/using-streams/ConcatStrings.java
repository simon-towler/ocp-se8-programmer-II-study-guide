import java.util.stream.Stream;

class ConcatStrings {
   public static void main(String... args) {
     Stream<String> stream = Stream.of("w", "o", "l", "f");

     // this works in parallel only if we don't care about the order of the letters. It could return them in almost any order.
     // supplier, accumulator, combiner
     StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
     System.out.println(word); // wolf
   }

}
