package tetris;

/**
 * Board
 */
public class Board {
  char[][] board;
  int HEIGHT;
  int WIDTH;
  public Board(int h, int w){
    this.HEIGHT = h;
    this.WIDTH = w;
    board = new char[h][w];
  };
  public void printBoard(Board newBoard){
    for (int i = 0; i < newBoard.WIDTH + 2; i++) {
      System.out.print("\u2582");
    }
    System.out.println();
    for (int i = 0; i < newBoard.HEIGHT; i++) {
      System.out.print("\u2588");
      for (int j = 0; j < newBoard.WIDTH; j++) {
        System.out.print(' ');
      }
      System.out.println("\u2588");
    }
    for (int i = 0; i < newBoard.WIDTH + 2; i++) {
      System.out.print("\u2588");
    }
    System.out.println();
  };
}
