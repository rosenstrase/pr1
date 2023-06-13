package GUI_Jframe_Vererbung.WelliRechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Waehrungsrechner extends JFrame implements ActionListener {
    private JTextField SingapurdollarEingabe;
    private JTextField Eurowert;
    JButton umrechnen;
    JComboBox<String> waehrung;
    public Waehrungsrechner(String text) {
        super(text);
        setSize(400, 150);
        this.setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SingapurdollarEingabe = new JTextField();
        SingapurdollarEingabe.setSize(100, 50);
        this.add(SingapurdollarEingabe);

        Eurowert = new JTextField();
        Eurowert.setSize(100, 50);
        this.add(Eurowert);

        waehrung = new JComboBox<String>();
        waehrung.addItem("SGD");
        waehrung.addItem("EUR");
        this.add(waehrung);

        umrechnen = new JButton("Umrechnen");
        umrechnen.addActionListener(this);
        this.add(umrechnen);
    }
    public static void main(String[] args) {
        Waehrungsrechner frame = new Waehrungsrechner("Wellsteins Währungsrechner");
        frame.setVisible(true);
        frame.setBounds(100, 100, 450, 300);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double exchangeRate = 0.62; // Wechselkurs SGD zu EUR
        double sgdAmount = Double.parseDouble(SingapurdollarEingabe.getText());
        double eurAmount = sgdAmount * exchangeRate;
        Eurowert.setText(String.format("%.2f", eurAmount));
    }
}

