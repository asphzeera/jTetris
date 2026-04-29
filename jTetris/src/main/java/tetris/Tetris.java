package tetris;

import java.util.Map;
import java.util.HashMap;

/**
 * Tetris
 */
public class Tetris {
  public static void main(String[] args) {
    Map<String, Shapes> shapes = new HashMap<>();

    //Lindo tabuleiro
    Board newBoard = new Board(20, 10);

    shapes.put("TShape", new Shapes(
      new Vertex[]{
        new Vertex(0, 1),
        new Vertex(1, 1),
        new Vertex(1, 2),
        new Vertex(2, 1),
      }
    ));

    shapes.put("JShape", new Shapes(
      new Vertex[]{
        new Vertex(0, 2),
        new Vertex(1, 2),
        new Vertex(2, 2),
        new Vertex(2, 1),
      }
    ));

    shapes.put("IShape", new Shapes(
      new Vertex[]{
        new Vertex(0, 1),
        new Vertex(1, 1),
        new Vertex(2, 1),
        new Vertex(3, 1),
      }
    ));

    shapes.put("LShape", new Shapes(
      new Vertex[]{
        new Vertex(0, 1),
        new Vertex(1, 1),
        new Vertex(2, 1),
        new Vertex(2, 2),
      }
    ));

    shapes.put("SShape", new Shapes(
      new Vertex[]{
        new Vertex(1, 2),
        new Vertex(1, 1),
        new Vertex(2, 1),
        new Vertex(2, 0),
      }
    ));

    shapes.put("ZShape", new Shapes(
      new Vertex[]{
        new Vertex(1, 1),
        new Vertex(1, 2),
        new Vertex(2, 2),
        new Vertex(2, 3),
      }
    ));
    shapes.put("OShape", new Shapes(
      new Vertex[]{
        new Vertex(1, 1),
        new Vertex(1, 2),
        new Vertex(2, 1),
        new Vertex(2, 2),
      }
    ));

    Vertex[] getShape = shapes.get("OShape").getShapes();
    for(Vertex v : getShape){
      v.getVertex();
    };

    Functions.printShape("OShape", shapes);
    System.out.println();
    Functions.printShape("LShape", shapes);
    System.out.println();
    Functions.printShape("ZShape", shapes);
    System.out.println();
    Functions.printShape("SShape", shapes);
    System.out.println();
    Functions.printShape("TShape", shapes);
    System.out.println();
    Functions.printShape("IShape", shapes);
    System.out.println();
    Functions.printShape("JShape", shapes);
    System.out.println();
  };
}
