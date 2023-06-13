package GUI_Jframe_Vererbung.WelliRechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WaehrungsrechnerChatGPT extends JFrame implements ActionListener {
    private JTextField sgdTextField;
    private JTextField eurTextField;

    public WaehrungsrechnerChatGPT() {
        setTitle("Währungsrechner - SGD zu EUR");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;

        JLabel sgdLabel = new JLabel("Singapurdollar:");
        panel.add(sgdLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        sgdTextField = new JTextField();
        panel.add(sgdTextField, c);

        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        JLabel eurLabel = new JLabel("Eurobetrag:");
        panel.add(eurLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        eurTextField = new JTextField();
        eurTextField.setEditable(false);
        panel.add(eurTextField, c);

        JButton convertButton = new JButton("Umrechnen");
        convertButton.addActionListener(this);

        c.gridx = 1;
        c.gridy = 2;
        c.anchor = GridBagConstraints.LINE_END;
        panel.add(convertButton, c);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        WaehrungsrechnerChatGPT converter = new WaehrungsrechnerChatGPT();
    }

    public void actionPerformed(ActionEvent e) {
        double exchangeRate = 0.62; // Wechselkurs SGD zu EUR
        String input = sgdTextField.getText();

        if (input.matches("\\d+(\\.\\d+)?")) { // Überprüfung, ob die Benutzereingabe eine Zahl ist
            double sgdAmount = Double.parseDouble(input);
            double eurAmount = sgdAmount * exchangeRate;
            eurTextField.setText(String.format("%.2f", eurAmount));
        } else {
            JOptionPane.showMessageDialog(this, "Ungültige Eingabe. Bitte geben Sie eine Zahl ein.", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }
}

