import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar implements ActionListener{
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
            it.addActionListener(this);
        }menuBar.add(menu);
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }

    public void actionPerformed(ActionEvent e) {
        String comStr = e.getActionCommand();

        if(comStr.equals("Exit"))
            System.exit(0);
    }
}
