package X390_WindBuilder_Aufgaben;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryCalculator extends JFrame {
    private JTextField radiusField;
    private JTextField heightField;
    private JLabel volumeLabel;
    private JLabel surfaceAreaLabel;
    private JLabel mantleAreaLabel;

    public GeometryCalculator() {
        setTitle("Geometry Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel(new GridLayout(4, 1));

        JPanel spherePanel = createShapePanel("Sphere");
        JPanel cylinderPanel = createShapePanel("Cylinder");
        JPanel conePanel = createShapePanel("Cone");

        mainPanel.add(spherePanel);
        mainPanel.add(cylinderPanel);
        mainPanel.add(conePanel);

        add(mainPanel);

        // Event listeners for buttons
        JButton sphereButton = (JButton) spherePanel.getComponent(4);
        JButton cylinderButton = (JButton) cylinderPanel.getComponent(4);
        JButton coneButton = (JButton) conePanel.getComponent(4);

        sphereButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateSphere();
            }
        });

        cylinderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateCylinder();
            }
        });

        coneButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateSphere();
            }
        });
    }

    private JPanel createShapePanel(String shapeName) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBorder(BorderFactory.createTitledBorder(shapeName));

        JLabel radiusLabel = new JLabel("Radius:");
        JLabel heightLabel = new JLabel("Height:");

        radiusField = new JTextField(10);
        heightField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");

        volumeLabel = new JLabel("Volume:");
        surfaceAreaLabel = new JLabel("Surface Area:");
        mantleAreaLabel = new JLabel("Mantle Area:");

        panel.add(radiusLabel);
        panel.add(radiusField);
        panel.add(heightLabel);
        panel.add(heightField);
        panel.add(calculateButton);
        panel.add(volumeLabel);
        panel.add(surfaceAreaLabel);
        panel.add(mantleAreaLabel);

        return panel;
    }

    private void calculateSphere() {
        try {
            double radius = Double.parseDouble(radiusField.getText());

            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

            volumeLabel.setText("Volume: " + String.format("%.2f", volume));
            surfaceAreaLabel.setText("Surface Area: " + String.format("%.2f", surfaceArea));
            mantleAreaLabel.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid number for the radius.");
        }
    }

    private void calculateCylinder() {
        try {
            double radius = Double.parseDouble(radiusField.getText());
            double height = Double.parseDouble(heightField.getText());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
            double mantleArea = 2 * Math.PI * radius * height;

            volumeLabel.setText("Volume: " + String.format("%.2f", volume));
        } finally {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid number for the radius and height.");
        }
    }
}
