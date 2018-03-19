import java.awt.*;
import java.awt.event.*;
import java.text.MessageFormat;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
import org.mariuszgromada.math.mxparser.*;
/*
 * Created by JFormDesigner on Sun Mar 18 23:10:50 CET 2018
 */



/**
 * @author unknown
 */
public class Window extends JFrame {
    public Window() {
        initComponents();
    }

    private void menuItem1ActionPerformed(ActionEvent e) {
        textField1.setText(null);
        textArea1.setText(null);
    }

    private void menuItem2ActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void button1ActionPerformed(ActionEvent e) {
        Expression exp = new Expression(textField1.getText());
        textArea1.append("" + exp.calculate());
        textField1.setText(null);
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Rafa FI
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Options");

                //---- menuItem1 ----
                menuItem1.setText("Reset");
                menuItem1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        menuItem1ActionPerformed(e);
                    }
                });
                menu1.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("Exit");
                menuItem2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        menuItem2ActionPerformed(e);
                    }
                });
                menu1.add(menuItem2);
            }
            menuBar1.add(menu1);
        }
        setJMenuBar(menuBar1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //======== scrollPane2 ========
        {

            //---- textArea1 ----
            textArea1.setEditable(false);
            scrollPane2.setViewportView(textArea1);
        }
        contentPane.add(scrollPane2, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }
        contentPane.add(scrollPane1, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- textField1 ----
        textField1.setHorizontalAlignment(SwingConstants.LEFT);
        contentPane.add(textField1, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button1 ----
        button1.setText("Evaluate");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });
        contentPane.add(button1, new GridConstraints(1, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Rafa FI
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JScrollPane scrollPane1;
    private JList list1;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
