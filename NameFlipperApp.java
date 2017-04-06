/**
 * Created by Hollingsworth on 4/6/2017.
 */
public class NameFlipperApp extends MainFrame {

    public NameFlipperApp(){
        super("Flip your Name", 400, 150);
        add(new NameFlipperPanel());
    }
}
