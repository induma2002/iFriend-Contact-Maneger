import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("IFriend Contact Organizer");
        frame.setLayout(new GridLayout(1,2));
        frame.setSize(799,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);
    }



    JLabel homePageLable , imageLabel ;// image label and home page lable
    JPanel menuPanel ;// This panal Store menu Button homelable and exit button
    JButton addbt , updatebt , serchbt , deletebt , viewbt , exitbtn;// All buttons in here

    MyFrame(){
        ImageIcon imageIcon = new ImageIcon("Img/img.png");// This claa creat image object and se path
        GridLayout gridLayout = new GridLayout(7, 1, 300, 10);// This class creat grid layout Object for use panel and Ican add button gap using it

        homePageLable = new JLabel("Home Page");//Create Home Page lable

        homePageLable.setFont(new Font("serif", Font.BOLD, 30));// Set Font and Size for home page lable
        homePageLable.setHorizontalAlignment(SwingConstants.CENTER);// Set Horizontal alignment
        homePageLable.setVerticalAlignment(SwingConstants.CENTER);// Set Vertical alignment

        menuPanel = new JPanel(gridLayout);// Create Menu Panel
        menuPanel.setBackground(Color.cyan);// Set background color for menu panel as blue

        //////////////// Add Button in menu panel /////////////////
        addbt = new JButton("Add New Contact");
        updatebt = new JButton("Update Contact");
        serchbt = new JButton("Search Contact");
        deletebt = new JButton("Delete Contact");
        viewbt = new JButton("View Contact");
        exitbtn = new JButton("Exit");

        imageLabel = new JLabel(imageIcon);// Add image in image label using "ImageIcon imageIcon = new ImageIcon("Img/img.png");"


        /////////////add button and homepage lable in menu panel///////////////
        menuPanel.add(homePageLable);
        menuPanel.add(addbt);
        menuPanel.add(updatebt);
        menuPanel.add(serchbt);
        menuPanel.add(deletebt);
        menuPanel.add(viewbt);
        menuPanel.add(exitbtn);


        ////////////add menu panel in frame///////////////
        this.add(imageLabel);
        this.add(menuPanel);

        addbt.addActionListener(this);
        updatebt.addActionListener(this);
        serchbt.addActionListener(this);
        deletebt.addActionListener(this);
        viewbt.addActionListener(this);
        exitbtn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addbt) {
            this.setVisible(false);
            //Main.addContact();
            AddContactFrame addContactFrame = new AddContactFrame();
            addContactFrame.setTitle("IFriend Contact Organizer");
            addContactFrame.setSize(799,600);
            addContactFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            addContactFrame.setBackground(Color.WHITE);
            addContactFrame.setVisible(true);


        } else if (e.getSource() == updatebt) {
            this.setVisible(false);
            UpdateContactFrame updateContactFrame = new UpdateContactFrame();
            updateContactFrame.setTitle("IFriend Contact Organizer");
            updateContactFrame.setSize(799,600);
            updateContactFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            updateContactFrame.setBackground(Color.WHITE);
            updateContactFrame.setVisible(true);
        } else if (e.getSource() == serchbt) {
            this.setVisible(false);
            SerchContactFrame serchContactFrame = new SerchContactFrame();
            serchContactFrame.setTitle("IFriend Contact Organizer");
            serchContactFrame.setSize(799,600);
            serchContactFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            serchContactFrame.setBackground(Color.WHITE);
            serchContactFrame.setVisible(true);
           // Main.search();
        } else if (e.getSource() == deletebt) {
            this.setVisible(false);
            DeletContactFrame deleteContactFrame = new DeletContactFrame();
            deleteContactFrame.setTitle("IFriend Contact Organizer");
            deleteContactFrame.setSize(799,600);
            deleteContactFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            deleteContactFrame.setBackground(Color.WHITE);
            deleteContactFrame.setVisible(true);
            //Main.deleteContact();


        } else if (e.getSource() == viewbt) {
            Main.listOne();
        } else if (e.getSource() == exitbtn) {
            System.exit(0);
        }

    }
}
