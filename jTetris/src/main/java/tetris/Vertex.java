package tetris;

/**
 * Vertex
 */
public class Vertex {

  int x;
  int y;

  public Vertex(int x, int y){
    this.x = x;
    this.y = y;
  };

  public void getVertex(){
    System.out.println(x + " " + y);
  };
}
