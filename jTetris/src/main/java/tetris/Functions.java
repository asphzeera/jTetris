package tetris;

import java.util.Map;

/**
 * Functions
 */
public class Functions {
  public static void printShape(String key, Map<String, Shapes> shapeMap){
    int[][] newShape = new int[4][4];
    Shapes shomting = shapeMap.get(key);
    Vertex cord1 = shomting.dots[0];
    Vertex cord2 = shomting.dots[1];
    Vertex cord3 = shomting.dots[2];
    Vertex cord4 = shomting.dots[3];
    newShape[cord1.x][cord1.y] = 1;
    newShape[cord2.x][cord2.y] = 1;
    newShape[cord3.x][cord3.y] = 1;
    newShape[cord4.x][cord4.y] = 1;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if(newShape[i][j] != 1){
          newShape[i][j] = 0;
        };
      }
    }
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
}
