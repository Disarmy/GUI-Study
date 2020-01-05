package disarm;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    private ToolPanel toolPanel = new ToolPanel();
    private MyCanvas canvas = new MyCanvas();

    public LeftPanel(){
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        add(toolPanel);
        add(canvas);

        setVisible(true);
    }
}
