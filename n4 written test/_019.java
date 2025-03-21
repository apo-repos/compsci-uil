public class _019 {
  public static void main(String[] args) {
    int box = 0;
    int[][] mat = new int[8][8];
    for(int r = 0; r < mat.length; r=r+1)
      for(int cc = r; cc <mat[r].length; cc+=1) {
        box++;
        mat[r][cc] = box;
      }
      System.out.print(mat[3][3]);
    }
}
