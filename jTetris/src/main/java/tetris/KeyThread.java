package tetris;

import java.awt.event.KeyEvent;

/**
 * KeyGetter
 */
public class KeyThread extends KeyGetter implements Runnable {
  KeyGetter kg = new KeyGetter();
  KeyEvent e;

  @Override
  public void run(){
    kg.keyPressed(e);
    
  };
}
