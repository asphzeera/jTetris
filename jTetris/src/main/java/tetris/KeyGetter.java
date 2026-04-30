package tetris;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * KeyGetter
 */
public class KeyGetter implements KeyListener{

  @Override
  public void keyTyped(KeyEvent e){
    int keyCode = e.getKeyCode();
    System.out.println("Key typed: " + e.getKeyChar());
  };
  @Override
  public void keyPressed(KeyEvent e){
    int keyCode = e.getKeyCode();
    System.out.println("Key pressed: " + KeyEvent.getKeyText(keyCode));
  };
  @Override
  public void keyReleased(KeyEvent e){
    int keyCode = e.getKeyCode();
    System.out.println("Key released: " + KeyEvent.getKeyText(keyCode));
  };
}
