import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Hollingsworth on 4/6/2017.
 */
public class BtnPanel extends JPanel {
    private IFlipper flipOpr;
    private NameFlipperPanel nameFlipperPanel;
    private JButton flipperBtn = new JButton("Click to flip");


    public BtnPanel(NameFlipperPanel nameFlipperPanel){
        this.nameFlipperPanel = nameFlipperPanel;
        setLayout(new FlowLayout(FlowLayout.CENTER));
        flipperBtn.setToolTipText("Click here to flip your Name");
        add(flipperBtn);

        flipperBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setResultLbl("Flip");
                flipOpr = new Flip();
                btnFlipAction();

            }
        });
    }
    public void setResultLbl(String label){
        nameFlipperPanel.ipPanel.setResultsLbl(label);
    }

    public void btnFlipAction(){
        String fristName = nameFlipperPanel.ipPanel.getFirstName();
        String lastName = nameFlipperPanel.ipPanel.getLastName();
        nameFlipperPanel.ipPanel.setFlippedTxt(flipOpr.flip(fristName, lastName));
    }
}
