import java.util.stream.Stream;

class MultiplyIntegers {
  public static void main(String... args) {
    Stream<Integer> stream = Stream.of(3,5,6);
    System.out.println(stream.reduce( 1, (a,b) -> a*b) ); // 90
  }
}
