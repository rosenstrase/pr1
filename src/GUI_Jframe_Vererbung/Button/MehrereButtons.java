package GUI_Jframe_Vererbung.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MehrereButtons extends JFrame implements ActionListener {
    JButton [] btns;
    String eingabe ="";
    public static final String CODE ="123";
    public MehrereButtons(String title) {
        super(title);
        this.setSize(200, 200);
        this.setLayout(new FlowLayout());

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        btns = new JButton[9];
        int i=1;
        for (JButton btn: btns) {
            btn = new JButton(Integer.toString(i));
            btn.addActionListener(this);
            btn.setActionCommand(Integer.toString(i));
            this.add(btn);
            i++;
        }

            JButton reset = new JButton("Reset");
            reset.addActionListener(this);
            reset.setActionCommand("0");
            this.add(reset);
        }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getActionCommand().equals("0")) {
            eingabe ="";
            this.getContentPane().setBackground(Color.white);
        } else {
            eingabe += evt.getActionCommand();
            if (eingabe.length() == 3) {
                if (eingabe.equals(CODE)) {
                    this.getContentPane().setBackground(Color.green);
                } else {
                    this.getContentPane().setBackground(Color.red);
                    eingabe="";
                }
            }
        }
    }
}
