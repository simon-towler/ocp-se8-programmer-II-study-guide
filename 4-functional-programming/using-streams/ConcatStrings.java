class ConcatStrings {
   public static void main(String... args) {
     String[] array = new String[] {"w", "o", "l", "f"};
     String result = "";
     for (String s: array) result = result + s;
     System.out.println(result); // wolf
   }

}
