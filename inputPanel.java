import javax.swing.*;
import java.awt.*;

/**
 * Created by Hollingsworth on 4/6/2017.
 */
public class inputPanel extends JPanel {
    private NameFlipperPanel nameFlipperPanel;

    private JLabel firstName = new JLabel("First Name", JLabel.CENTER);
    private JLabel lastName = new JLabel("Last Name", JLabel.CENTER);
    private JLabel flippedName = new JLabel("Flipped Name", JLabel.CENTER);

    private JTextField firstTxt = new JTextField("");
    private JTextField lastTxt = new JTextField("");
    private JTextField flippedTxt = new JTextField("");

    public inputPanel(NameFlipperPanel nameFlipperPanel){
        this.nameFlipperPanel = nameFlipperPanel;
        setLayout(new GridLayout(2,3, 5, 5));
        flippedTxt.setBackground(Color.gray);
        flippedTxt.setEditable(false);
        firstName.setToolTipText("Input your First Name");
        lastName.setToolTipText("Input your Last Name");
        flippedTxt.setToolTipText("Your Name flipped will appear here on click");
        add(firstName);
        add(lastName);
        add(flippedName);
        add(firstTxt);
        add(lastTxt);
        add(flippedTxt);

    }
    void setResultsLbl(String label){
        flippedTxt.setText(label);
    }
    public String getFirstName(){
        return firstTxt.getText();
    }
    public String getLastName(){
        return lastTxt.getText();
    }

    public void setFlippedTxt(String changedName){
        flippedTxt.setText(changedName);

    }






}
