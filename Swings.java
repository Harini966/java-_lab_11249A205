import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo extends JFrame implements ActionListener {

    JLabel title, nameLabel, ageLabel, genderLabel,
           courseLabel, resultLabel;

    JTextField nameField, ageField;

    JRadioButton male, female;

    JComboBox<String> courseBox;

    JCheckBox javaCheck, pythonCheck;

    JButton submitButton, clearButton, exitButton;

    ButtonGroup genderGroup;

    // Constructor
    SwingDemo() {

        setTitle("Student Registration Form");

        setSize(500, 550);

        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.LIGHT_GRAY);

        // Title
        title = new JLabel("STUDENT REGISTRATION FORM");

        title.setBounds(100, 20, 300, 30);

        title.setFont(new Font("Arial", Font.BOLD, 18));

        add(title);

        // Name
        nameLabel = new JLabel("Student Name:");

        nameLabel.setBounds(50, 80, 120, 30);

        add(nameLabel);

        nameField = new JTextField();

        nameField.setBounds(180, 80, 200, 30);

        add(nameField);

        // Age
        ageLabel = new JLabel("Age:");

        ageLabel.setBounds(50, 130, 120, 30);

        add(ageLabel);

        ageField = new JTextField();

        ageField.setBounds(180, 130, 200, 30);

        add(ageField);

        // Gender
        genderLabel = new JLabel("Gender:");

        genderLabel.setBounds(50, 180, 120, 30);

        add(genderLabel);

        male = new JRadioButton("Male");

        male.setBounds(180, 180, 80, 30);

        female = new JRadioButton("Female");

        female.setBounds(270, 180, 100, 30);

        genderGroup = new ButtonGroup();

        genderGroup.add(male);

        genderGroup.add(female);

        add(male);

        add(female);

        // Course
        courseLabel = new JLabel("Select Course:");

        courseLabel.setBounds(50, 230, 120, 30);

        add(courseLabel);

        String courses[] = {
            "Java",
            "Python",
            "C Programming",
            "C++",
            "Web Development"
        };

        courseBox = new JComboBox<>(courses);

        courseBox.setBounds(180, 230, 200, 30);

        add(courseBox);

        // Skills
        JLabel skillLabel = new JLabel("Skills:");

        skillLabel.setBounds(50, 280, 120, 30);

        add(skillLabel);

        javaCheck = new JCheckBox("Java");

        javaCheck.setBounds(180, 280, 80, 30);

        pythonCheck = new JCheckBox("Python");

        pythonCheck.setBounds(270, 280, 100, 30);

        add(javaCheck);

        add(pythonCheck);

        // Submit Button
        submitButton = new JButton("Submit");

        submitButton.setBounds(50, 350, 100, 35);

        add(submitButton);

        // Clear Button
        clearButton = new JButton("Clear");

        clearButton.setBounds(180, 350, 100, 35);

        add(clearButton);

        // Exit Button
        exitButton = new JButton("Exit");

        exitButton.setBounds(310, 350, 100, 35);

        add(exitButton);

        // Result Label
        resultLabel = new JLabel("Enter Student Details");

        resultLabel.setBounds(50, 410, 400, 40);

        add(resultLabel);

        // Event Handling
        submitButton.addActionListener(this);

        clearButton.addActionListener(this);

        exitButton.addActionListener(this);

        setVisible(true);
    }

    // Action Listener
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton) {

            String name = nameField.getText();

            String age = ageField.getText();

            String gender = "Not Selected";

            if (male.isSelected()) {
                gender = "Male";
            }

            else if (female.isSelected()) {
                gender = "Female";
            }

            String course =
                (String) courseBox.getSelectedItem();

            String skills = "";

            if (javaCheck.isSelected()) {
                skills += "Java ";
            }

            if (pythonCheck.isSelected()) {
                skills += "Python ";
            }

            if (name.trim().isEmpty() || age.trim().isEmpty()) {

                JOptionPane.showMessageDialog(
                    this,
                    "Please enter Name and Age"
                );

                return;
            }

            resultLabel.setText("Registration Successful!");

            JOptionPane.showMessageDialog(
                this,
                "Student Details\n" +
                "Name: " + name +
                "\nAge: " + age +
                "\nGender: " + gender +
                "\nCourse: " + course +
                "\nSkills: " + skills
            );
        }

        else if (e.getSource() == clearButton) {

            nameField.setText("");

            ageField.setText("");

            genderGroup.clearSelection();

            courseBox.setSelectedIndex(0);

            javaCheck.setSelected(false);

            pythonCheck.setSelected(false);

            resultLabel.setText("Enter Student Details");
        }

        else if (e.getSource() == exitButton) {

            System.exit(0);
        }
    }

    // Main Method
    public static void main(String[] args) {

        SwingDemo obj = new SwingDemo();
    }
}
