import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class AddContactFrame extends JFrame implements ActionListener {
    JLabel addContactLabel, contactIDLabel, idlable;
    JLabel nameLabel, phoneNumberLabel, companyLabel, salaryLabel, birthdayLabel;
    JTextField nameField, phoneNumberField, companyField, salaryField, birthdayField;
    JButton addContactButton, cancelButton, backToHomeButton;
    JPanel buttonPanel, infoPanel, deatilsPanel, AddContactPanel;
    int counter = 0;
    AddContactFrame() {

        setTitle("Add Contact");

        addContactLabel = new JLabel("ADD CONTACT");
        addContactLabel.setFont(new Font("serif", Font.BOLD, 30));
        addContactLabel.setVerticalAlignment(SwingConstants.CENTER);
        addContactLabel.setHorizontalAlignment(SwingConstants.CENTER);// Set Horizontal alignment
        contactIDLabel = new JLabel("Contact ID : - ");
        contactIDLabel.setFont(new Font("serif", Font.BOLD, 20));

        String SID = String.format("C%04d", counter);
        idlable = new JLabel(SID);
        idlable.setFont(new Font("serif", Font.BOLD, 20));

        GridLayout gridLayout2 = new GridLayout(6, 2, 300, 10);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        infoPanel = new JPanel(new GridLayout(2, 1));
        deatilsPanel = new JPanel(gridLayout2);
        AddContactPanel = new JPanel();
        AddContactPanel.setBackground(Color.cyan);

        nameLabel = new JLabel("Name");
        phoneNumberLabel = new JLabel("Contact Number");
        companyLabel = new JLabel("Company");
        salaryLabel = new JLabel("Salary");
        birthdayLabel = new JLabel("Birthday");

        nameField = new JTextField(20);
        phoneNumberField = new JTextField(20);
        companyField = new JTextField(20);
        salaryField = new JTextField(20);
        birthdayField = new JTextField(20);

        addContactButton = new JButton("Add Contact");
        cancelButton = new JButton("Cancel");
        backToHomeButton = new JButton("Back To Home");

        buttonPanel.add(addContactButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(backToHomeButton);

        deatilsPanel.add(contactIDLabel);
        deatilsPanel.add(idlable);
        deatilsPanel.add(nameLabel);
        deatilsPanel.add(nameField);
        deatilsPanel.add(phoneNumberLabel);
        deatilsPanel.add(phoneNumberField);
        deatilsPanel.add(companyLabel);
        deatilsPanel.add(companyField);
        deatilsPanel.add(salaryLabel);
        deatilsPanel.add(salaryField);
        deatilsPanel.add(birthdayLabel);
        deatilsPanel.add(birthdayField);

        /*infoPanel.add(contactIDLabel);*/
        infoPanel.add(deatilsPanel);
        AddContactPanel.add(addContactLabel);

        this.add(AddContactPanel, BorderLayout.NORTH);
        this.add(infoPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);

        addContactButton.addActionListener(this);
        cancelButton.addActionListener(this);
        backToHomeButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addContactButton) {


            try {
                int counter = 0;
                for (int i = 0; i < Main.contact.length; i++) {
                    if (Main.contact[i] != null) {
                        counter++;
                    }
                }

                counter++; //increese by one(have to change )
                String id = String.format("C%04d", counter);
                idlable.setText(id);
                String name = nameField.getText();
                String phoneNumber = phoneNumberField.getText();
                String companyName = companyField.getText();
                int salary = Integer.parseInt(salaryField.getText());
                String birthday = birthdayField.getText();


                Contact gotContact = new Contact(id, name, phoneNumber, companyName, salary, birthday);
                Contact[] tempcontact = new Contact[Main.contact.length + 1];
                for (int i = 0; i < Main.contact.length; i++) {
                    tempcontact[i] = Main.contact[i];
                }
                Main.contact = tempcontact;
                Main.contact[tempcontact.length - 1] = gotContact;

                JOptionPane.showMessageDialog(null, "Contact Saved Successfully");
            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(null, "Invalid Input");
                counter--;
            }
            //System.out.println("Add Contact");
        } else if (e.getSource() == cancelButton) {

        } else if (e.getSource() == backToHomeButton) {
            MyFrame frame = new MyFrame();
            frame.setTitle("IFriend Contact Organizer");
            frame.setLayout(new GridLayout(1, 2));
            frame.setSize(799, 600);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setBackground(Color.WHITE);
            frame.setVisible(true);
            this.setVisible(false);

            //System.out.println("Back To Home");
        }

    }
}
