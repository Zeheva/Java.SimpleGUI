

import javax.swing.*;

/**
 * Created by Hollingsworth on 4/6/2017.
 */
public class MainFrame extends JFrame {

   static final int WIDTH = 300, HIGHT = 300;

    public MainFrame(){
        super("Main Frame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public MainFrame(String name){
        super(name);
        setFrame(WIDTH,HIGHT);
    }

    public MainFrame(String name, int w, int h){
        super(name);
        setFrame(w,h);
    }

  public void display(){
        setVisible(true);
    }

    public void setFrame(int w, int h){
      setSize(w,h);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   public static void main(String[] args){
       NameFlipperApp flipperApp = new NameFlipperApp();
       flipperApp.display();
    }
}
