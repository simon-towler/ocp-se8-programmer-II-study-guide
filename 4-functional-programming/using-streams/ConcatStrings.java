import java.util.stream.Stream;

class ConcatStrings {
   public static void main(String... args) {
     Stream<String> stream = Stream.of("w", "o", "l", "f");
     String word = stream.reduce("", String::concat);
     System.out.println(word); // wolf
   }

}
