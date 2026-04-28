package tetris;

import java.util.Map;
import java.util.HashMap;

/**
 * Tetris
 */
public class Tetris {
  public static void main(String[] args) {
    Map<String, Shapes> shapes = new HashMap<>();

    shapes.put("TShape", new Shapes(
      new Vertex[]{
        new Vertex(1, 0),
        new Vertex(0, 1),
        new Vertex(-1, 0),
        new Vertex(0, 0),
      }
    ));

    shapes.put("IShape", new Shapes(
      new Vertex[]{
        new Vertex(0, 3),
        new Vertex(0, 2),
        new Vertex(0, 1),
        new Vertex(0, 0),
      }
    ));

    shapes.put("JShape", new Shapes(
      new Vertex[]{
        new Vertex(0, 2),
        new Vertex(0, 1),
        new Vertex(-1, 0),
        new Vertex(0, 0),
      }
    ));

    shapes.put("LShape", new Shapes(
      new Vertex[]{
        new Vertex(0, 2),
        new Vertex(0, 1),
        new Vertex(1, 0),
        new Vertex(0, 0),
      }
    ));

    shapes.put("SShape", new Shapes(
      new Vertex[]{
        new Vertex(1, 1),
        new Vertex(0, 1),
        new Vertex(-1, 0),
        new Vertex(0, 0),
      }
    ));

    shapes.put("ZShape", new Shapes(
      new Vertex[]{
        new Vertex(-1, 1),
        new Vertex(0, 1),
        new Vertex(1, 0),
        new Vertex(0, 0),
      }
    ));

    shapes.put("OShape", new Shapes(
      new Vertex[]{
        new Vertex(0, 1),
        new Vertex(1, 1),
        new Vertex(1, 0),
        new Vertex(0, 0),
      }
    ));
  };
}
