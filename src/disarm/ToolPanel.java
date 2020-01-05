package disarm;

import javax.swing.*;
import java.awt.*;

public class ToolPanel extends JPanel {
    public ToolPanel(){
        setLayout(new GridLayout(2, 4, 10, 10));
        setSize(new Dimension(1280, 200));
        setBackground(Color.GRAY);
        setVisible(true);
    }
}
