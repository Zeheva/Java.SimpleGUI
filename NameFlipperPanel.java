import javax.swing.*;
import java.awt.*;

/**
 * Created by Hollingsworth on 4/6/2017.
 */
public class NameFlipperPanel extends JPanel {
public BtnPanel btnPanel = new BtnPanel(this);
public inputPanel ipPanel = new inputPanel(this);


public NameFlipperPanel(){
    setLayout(new BorderLayout());
    setBackground(Color.blue);
    add(btnPanel, BorderLayout.SOUTH);
    add(ipPanel, BorderLayout.CENTER);
}
}
