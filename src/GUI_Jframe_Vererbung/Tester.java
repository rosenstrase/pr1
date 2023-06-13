package GUI_Jframe_Vererbung;

import javax.swing.*;
import java.awt.*;

public class Tester extends JFrame {

    JLabel lb;
    public Tester (String title) throws HeadlessException {
        super(title);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());

        lb = new JLabel("<html> <h1> Hello World </h1> </html>");
        this.add(lb);
    }

    public static void main(String[] args) {
        Tester fr = new Tester("Fenster im Layout");
        fr.setVisible(true);
    }
}