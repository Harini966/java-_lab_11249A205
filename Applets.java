import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AppletDemo extends Applet implements ActionListener {

    Label title, nameLabel, resultLabel;
    TextField nameField;
    Button submitButton, clearButton;

    // Initialization method
    public void init() {

        setLayout(new FlowLayout());

        setBackground(Color.lightGray);

        title = new Label("JAVA APPLET DEMONSTRATION");

        nameLabel = new Label("Enter Your Name:");

        nameField = new TextField(20);

        submitButton = new Button("Submit");

        clearButton = new Button("Clear");

        resultLabel = new Label("Welcome to Java Applet");

        add(title);
        add(nameLabel);
        add(nameField);
        add(submitButton);
        add(clearButton);
        add(resultLabel);

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    // Start method
    public void start() {
        System.out.println("Applet Started");
    }

    // Action event method
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton) {

            String name = nameField.getText();

            resultLabel.setText("Welcome " + name);

        }

        else if (e.getSource() == clearButton) {

            nameField.setText("");

            resultLabel.setText("Enter Your Name");
        }

        repaint();
    }

    // Paint method
    public void paint(Graphics g) {

        g.setColor(Color.blue);

        g.drawString("This is a Java Applet Program", 50, 150);

        g.setColor(Color.red);

        g.drawString("Applet Example", 50, 180);
    }

    // Stop method
    public void stop() {
        System.out.println("Applet Stopped");
    }

    // Destroy method
    public void destroy() {
        System.out.println("Applet Destroyed");
    }
}
