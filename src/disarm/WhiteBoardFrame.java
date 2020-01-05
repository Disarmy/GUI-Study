package disarm;

import javax.swing.*;
import java.awt.*;

public class WhiteBoardFrame extends JFrame {
    private JMenuBar menuBar = makeMenu();
    private JSplitPane split = new JSplitPane();
    private LeftPanel leftPanel = new LeftPanel();
    private RightPanel rightPanel = new RightPanel();

    public WhiteBoardFrame(){
        super("화이트 보드");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1600,900);
        setLocationRelativeTo(null);
        setJMenuBar(menuBar);

        split.setDividerLocation((int)(this.getWidth()*0.8));
        split.setLeftComponent(leftPanel);
        split.setRightComponent(rightPanel);

        add(split);

        setVisible(true);
    }

    private JMenuBar makeMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu mainMenu = new JMenu("파일");
        JMenuItem makeNewFileMenuItem = new JMenuItem("새로 만들기");
        JMenuItem openFileMenuItem = new JMenuItem("열기");
        JMenuItem saveFileMenuItem = new JMenuItem("저장");
        JMenuItem saveOtherNameMenuItem = new JMenuItem("다른 이름으로 저장");
        JMenuItem exitMenuItem = new JMenuItem("끝내기");

        mainMenu.add(makeNewFileMenuItem);
        mainMenu.add(openFileMenuItem);
        mainMenu.add(saveFileMenuItem);
        mainMenu.add(saveOtherNameMenuItem);
        mainMenu.addSeparator();
        mainMenu.add(exitMenuItem);

        JMenu settingMenu = new JMenu("설정");

        menuBar.add(mainMenu);
        menuBar.add(settingMenu);

        return menuBar;
    }

}
