import javax.swing.*;
import java.awt.*;

public class MenuBar {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItems[];

    public MenuBar() {
        menuBar = new JMenuBar();
        menuItems = new JMenuItem[2];
        menuItems[0] = new JMenuItem("Reset");
        menuItems[1] = new JMenuItem("Exit");
        menu = new JMenu("Options");

        for (JMenuItem it : menuItems) {
            menu.add(it);
        }menuBar.add(menu);
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }
}
