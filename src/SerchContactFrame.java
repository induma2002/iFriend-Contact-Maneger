import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class SerchContactFrame extends JFrame implements ActionListener {
    JLabel serchContactLabel, contactIDLabel ,idlable;
    JLabel nameLabel, phoneNumberLabel, companyLabel, salaryLabel, birthdayLabel;
    JTextField nameField, phoneNumberField, companyField, salaryField, birthdayField, SerchField;
    JButton backToHomeButton, SerchButton;
    JPanel buttonPanel, infoPanel, deatilsPanel, topPanel,SerchPanel;

    SerchContactFrame() {

        setTitle("Serch Contact");

        serchContactLabel = new JLabel("SERCH CONTACT");
        serchContactLabel.setFont(new Font("serif", Font.BOLD, 30));
        serchContactLabel.setVerticalAlignment(SwingConstants.CENTER);
        serchContactLabel.setHorizontalAlignment(SwingConstants.CENTER);// Set Horizontal alignment
        contactIDLabel = new JLabel("    Contact ID : - ");
        contactIDLabel.setFont(new Font("serif", Font.BOLD, 20));
        idlable = new JLabel("ID will be shown here");
        idlable.setFont(new Font("serif", Font.BOLD, 20));

        GridLayout gridLayout2 = new GridLayout(6, 2, 300, 10);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        infoPanel = new JPanel(new GridLayout(2,1));
        deatilsPanel = new JPanel(gridLayout2);
        topPanel = new JPanel(new GridLayout(2,1));
        topPanel.setBackground(Color.cyan);
        SerchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        nameLabel = new JLabel("            Name");
        phoneNumberLabel = new JLabel("            Contact Number");
        companyLabel = new JLabel("            Company");
        salaryLabel = new JLabel("            Salary");
        birthdayLabel = new JLabel("            Birthday");

        nameField = new JTextField(30);
        phoneNumberField = new JTextField();
        companyField = new JTextField();
        salaryField = new JTextField();
        birthdayField = new JTextField();
        SerchField = new JTextField(50);// Serch field



        backToHomeButton = new JButton("Back To Home");
        SerchButton = new JButton("Search");// Serch button

        SerchPanel.add(SerchField);
        SerchPanel.add(SerchButton);


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
        topPanel.add(serchContactLabel);
        topPanel.add(SerchPanel);

        this.add(topPanel,BorderLayout.NORTH);
        this.add(infoPanel,BorderLayout.CENTER);
        this.add(buttonPanel,BorderLayout.SOUTH);


        backToHomeButton.addActionListener(this);
        SerchButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {




        if(e.getSource() == backToHomeButton){
            MyFrame frame = new MyFrame();
            frame.setTitle("IFriend Contact Organizer");
            frame.setLayout(new GridLayout(1,2));
            frame.setSize(799,600);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setBackground(Color.WHITE);
            frame.setVisible(true);
            this.setVisible(false);

            //System.out.println("Back To Home");
        }
        else if (e.getSource() == SerchButton) {

            String search = SerchField.getText();
            boolean found = false;


            for (int i = 0; i < Main.contact.length; i++) {
                if (Main.contact[i].name.equalsIgnoreCase(search) || Main.contact[i].phoneNumber.equals(search)) {
                    found = true;
                    idlable.setText(Main.contact[i].id);
                    nameField.setText(Main.contact[i].name);
                    phoneNumberField.setText(Main.contact[i].phoneNumber);
                    companyField.setText(Main.contact[i].company);
                    salaryField.setText(Main.contact[i].salary+"");
                    birthdayField.setText(Main.contact[i].birthday);
                }
            }

            if (!found) {
                idlable.setText("Contact not found");
                nameField.setText("");
                phoneNumberField.setText("");
                companyField.setText("");
                salaryField.setText("");
                birthdayField.setText("");
            }


        }

    }
}
