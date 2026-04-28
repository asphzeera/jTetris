package tetris;

/**
 * Position
 */
public class Position {
  Shapes shape;
  int x;
  int y;

  public Position(Shapes shape){
    this.shape = shape;
    this.x = 5;
    this.y = 0;
  };

}
