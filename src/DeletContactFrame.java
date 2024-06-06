import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class DeletContactFrame extends JFrame implements ActionListener {
    JLabel deleteContactLabel, contactIDLabel ,idlable;
    JLabel nameLabel, phoneNumberLabel, companyLabel, salaryLabel, birthdayLabel;
    JTextField nameField, phoneNumberField, companyField, salaryField, birthdayField, SerchField;
    JButton deleteContactButton, cancelButton, backToHomeButton, SerchButton;
    JPanel buttonPanel, infoPanel, deatilsPanel, topPanel,SerchPanel;
    int index = -3;
    DeletContactFrame() {

        setTitle("Serch Contact");

        deleteContactLabel = new JLabel("DELETE CONTACT");
        deleteContactLabel.setFont(new Font("serif", Font.BOLD, 30));
        deleteContactLabel.setVerticalAlignment(SwingConstants.CENTER);
        deleteContactLabel.setHorizontalAlignment(SwingConstants.CENTER);// Set Horizontal alignment
        contactIDLabel = new JLabel("    Contact ID : - ");
        contactIDLabel.setFont(new Font("serif", Font.BOLD, 20));
        idlable = new JLabel("C001");
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

        deleteContactButton = new JButton("Delete");
        cancelButton = new JButton("Cancel");
        backToHomeButton = new JButton("Back To Home");
        backToHomeButton = new JButton("Back To Home");
        SerchButton = new JButton("Search");// Serch button

        SerchPanel.add(SerchField);
        SerchPanel.add(SerchButton);


        buttonPanel.add(deleteContactButton);
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
        topPanel.add(deleteContactLabel);
        topPanel.add(SerchPanel);

        this.add(topPanel,BorderLayout.NORTH);
        this.add(infoPanel,BorderLayout.CENTER);
        this.add(buttonPanel,BorderLayout.SOUTH);


        backToHomeButton.addActionListener(this);
        deleteContactButton.addActionListener(this);
        cancelButton.addActionListener(this);
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
        }else if (e.getSource() == SerchButton) {
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

                    index = i;

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
        } else if (e.getSource() == deleteContactButton) {
            //////////make temp array for delete data without space////////////

            Scanner sc = new Scanner(System.in);
            Contact[] tempContact;
            int delindex = index;


                ////// all arrays in same length /////

                    tempContact = new Contact[Main.contact.length - 1];

                    for (int i = 0; i < Main.contact.length - 1; i++) {
                        tempContact[i] = Main.contact[i];
                    }
                    ///// loop start fron delete index ///////
                    for (int i = delindex; i < tempContact.length; i++) {
                        tempContact[i] = Main.contact[i + 1];
                    }
                    ///// change reference ///////
                    Main.contact = tempContact;





            //System.out.println(Arrays.toString(ar));// for test

        }  else if (e.getSource() == cancelButton) {

        }

    }
}
