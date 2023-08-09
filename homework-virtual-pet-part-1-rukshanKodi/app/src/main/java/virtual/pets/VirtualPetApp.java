package virtual.pets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
public class VirtualPetApp {

  public static void main(String[] args) throws Exception {    
    //-----
    JFrame myJFrame = new JFrame();
    myJFrame.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) {
          System.out.println("test");
        }
        
      }
    });

    //-----
    
   System.out.println("welcome to Care my pet game"+
    "\n"+ "Enter most needed for my pet"
    +"\n"+ "1 for sleepy 2 for hungry");
 myJFrame.setVisible(true);
VirtualPet.tick("welcome", 25, 1000,0);
  }
}

