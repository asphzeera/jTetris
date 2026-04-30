package tetris;

import java.util.Map;

/**
 * Functions
 */
public class Functions {

  public static void printShape(String key, Map<String, Shapes> shapeMap){
    int[][] newShape = new int[4][4];
    Shapes shomting = shapeMap.get(key);

    setVertexCords(shomting, newShape);
    putValuesMatrix(newShape);
    printTetrominoe(newShape);
  };

  public static void setVertexCords(Shapes shomting, int[][] newShape){
    Vertex cord1 = shomting.dots[0];
    Vertex cord2 = shomting.dots[1];
    Vertex cord3 = shomting.dots[2];
    Vertex cord4 = shomting.dots[3];
    newShape[cord1.x][cord1.y] = 1;
    newShape[cord2.x][cord2.y] = 1;
    newShape[cord3.x][cord3.y] = 1;
    newShape[cord4.x][cord4.y] = 1;
  };

  public static void putValuesMatrix(int[][] newShape){
   for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if(newShape[i][j] != 1){
          newShape[i][j] = 0;
        };
      }
    }
  };
  
  public static void printTetrominoe(int[][] newShape){
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if(newShape[i][j] == 0){
          System.out.print(" ");
        }else{
          System.out.print("\u2593");
        };
      }
      System.out.println();
    }
  };
  
  public static void printAllShapes(Map<String, Shapes> shapes){
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
  
  public static void startShapes(Map<String, Shapes> shapes){
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
  };
}
