package component;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JPanel contentPane;
    private JButton Button;
    private JPanel panel1;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 1000);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(6, 6, 788, 65);
        contentPane.add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(6, 78, 788, 80);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JButton btnNewButton = new JButton("메뉴1");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setBounds(6, 6, 117, 68);
        panel_1.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("메뉴2");
        btnNewButton_1.setBounds(135, 6, 117, 68);
        panel_1.add(btnNewButton_1);

        JButton btnNewButton_1_1 = new JButton("메뉴3");
        btnNewButton_1_1.setBounds(264, 6, 117, 68);
        panel_1.add(btnNewButton_1_1);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(6, 170, 523, 796);
        contentPane.add(panel_2);
        panel_2.setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setBounds(541, 170, 253, 796);
        contentPane.add(panel_3);
        panel_3.setLayout(null);
    }


}
