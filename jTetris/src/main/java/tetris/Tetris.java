package tetris;

import java.util.Map;
import java.util.HashMap;

/**
 * Tetris
 */
public class Tetris {
  public static void main(String[] args) {
    Map<String, Shapes> shapes = new HashMap<>();

    KeyThread ky = new KeyThread();
    Thread thread = new Thread(ky);
    thread.start();
  };
}
