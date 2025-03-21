public class _020 {
  public static void main(String[] args) {
    String line = "splittingisfunforeveryone";
    String[] chunks = line.split("[^[is]]");
    System.out.print(chunks.length);
    System.out.println(chunks[3]);
    for (int i = 0; i < chunks.length; i++) {
      System.out.println(chunks[i]);
    }
  }
}
