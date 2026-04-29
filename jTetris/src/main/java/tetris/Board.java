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
}
