package GUI_Jframe_Vererbung.Zahlensafe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zahlenschloss extends JFrame implements ActionListener {
    JButton bEins, bZwei;
    public Zahlenschloss(String title) {
        super(title);
        bEins = new JButton("1");
        bZwei = new JButton("2");

        bEins.addActionListener(this);
        bZwei.addActionListener(this);

        this.setLayout(new FlowLayout());

        this.add(bEins);
        this.add(bZwei);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getActionCommand().equals("1")){
            this.getContentPane().setBackground(Color.green);
        }
        if (evt.getActionCommand().equals("2")){
            this.getContentPane().setBackground(Color.red);
        }
    }
}
