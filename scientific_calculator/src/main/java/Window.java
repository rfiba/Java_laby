import java.awt.*;
import java.awt.event.*;
import java.text.MessageFormat;
import javax.swing.*;
import javax.swing.event.*;
import com.intellij.uiDesigner.core.*;
import org.mariuszgromada.math.mxparser.*;
import javax.swing.DefaultListModel;
/*
 * Created by JFormDesigner on Sun Mar 18 23:10:50 CET 2018
 */



/**
 * @author unknown
 */
public class Window extends JFrame {

    private String lastTyping;
    public Window() {
        initComponents();
    }

    private void evaluate()
    {
        lastTyping = textField1.getText();
        Expression exp = new Expression(lastTyping);
        if(exp.checkSyntax())
        {
            String result = MessageFormat.format("{0} = {1}\n----\n",textField1.getText(), exp.calculate());
            textArea1.append(result);
            textField1.setText(null);
        }
        else{
            JOptionPane.showMessageDialog(null, "Syntax error" +
                            "", "Scientific calulator",
                    JOptionPane.ERROR_MESSAGE);}
        textField1.selectAll();

    }
    private void menuItem1ActionPerformed(ActionEvent e) {
        textField1.setText(null);
        textArea1.setText(null);
    }

    private void menuItem2ActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void button1ActionPerformed(ActionEvent e) {
        evaluate();
    }

    private void list1ValueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel)e.getSource();
        if (!e.getValueIsAdjusting()) {
            // code here
        }
        System.exit(0);
    }

    private void textField1KeyPressed(KeyEvent e) {
        if(e.getKeyCode() == 38)
            textField1.setText(lastTyping);

        if(e.getKeyChar() == '\n')
            evaluate();

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
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        menuItem1ActionPerformed(e);
                    }
                });
                menu1.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("Exit");
                menuItem2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        menuItem2ActionPerformed(e);
                    }
                });
                menu1.add(menuItem2);
            }
            menuBar1.add(menu1);
        }
        setJMenuBar(menuBar1);

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
            scrollPane1.setMaximumSize(new Dimension(100, -1));
            scrollPane1.setMinimumSize(new Dimension(100, -1));

            //---- list1 ----
            list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            list1.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    list1ValueChanged(e);
                }
            });
            scrollPane1.setViewportView(list1);
        }
        contentPane.add(scrollPane1, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_EAST, GridConstraints.FILL_VERTICAL,
            GridConstraints.SIZEPOLICY_FIXED,
            GridConstraints.SIZEPOLICY_FIXED,
            null, null, null, 0, true));

        //---- textField1 ----
        textField1.setHorizontalAlignment(SwingConstants.LEFT);
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                textField1KeyPressed(e);
            }
        });
        contentPane.add(textField1, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_SOUTH, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_FIXED,
            null, null, null));

        //---- button1 ----
        button1.setText("Evaluate");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });
        contentPane.add(button1, new GridConstraints(1, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        setSize(500, 430);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<FunctionName> listModel = new DefaultListModel<FunctionName>();
        listModel.addElement(new FunctionName("Sinus", "sin()"));
        listModel.addElement(new FunctionName("Cosinus", "cos()"));
        listModel.addElement(new FunctionName("Tangens", "tg()"));
        listModel.addElement(new FunctionName("Cotangens", "ctg()"));
        listModel.addElement(new FunctionName("Logarithm", "lg()"));


        list1 = new JList<FunctionName>(listModel);


        scrollPane1.add(list1);
        scrollPane1.setViewportView(list1);

        lastTyping = "0";

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
