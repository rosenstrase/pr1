package GUI_Jframe_Vererbung.Button;

import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttonbeispiel extends JFrame implements ActionListener{

    JButton bSchliessen;

    public Buttonbeispiel(String text) {
        super(text);
        this.setLayout(new FlowLayout());
        bSchliessen = new JButton("Schliessen");
        //Das Buttonframe-Objekt als Listener für den Button registrieren
        bSchliessen.addActionListener(this);
        this.add(bSchliessen);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bSchliessen.setText("aus");
        //system.exit(0);
    }
}
