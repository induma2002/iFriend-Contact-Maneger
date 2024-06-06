import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewContactFrame extends JFrame implements ActionListener {
    JPanel titlePanel , buttonPanel, bottompanel;
    JButton ListByNameButton, ListBySalaryButton, ListByBirthdayButton, cancelButton;
    JLabel titleLabel;
    ViewContactFrame(){

        GridLayout gridLayout = new GridLayout(3, 1, 300, 50);

        titlePanel = new JPanel();
        titlePanel.setBackground(Color.cyan);
        buttonPanel = new JPanel(gridLayout);
        bottompanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        titleLabel = new JLabel("CONTACT LIST");
        titleLabel.setFont(new Font("serif", Font.BOLD, 40));

        ListByNameButton = new JButton("List By Name");
        ListBySalaryButton = new JButton("List By Salary");
        ListByBirthdayButton = new JButton("List By Birthday");
        cancelButton = new JButton("Cancel");

        titlePanel.add(titleLabel);
        buttonPanel.add(ListByNameButton);
        buttonPanel.add(ListBySalaryButton);
        buttonPanel.add(ListByBirthdayButton);
        bottompanel.add(cancelButton);

        this.add(titlePanel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);
        this.add(bottompanel, BorderLayout.SOUTH);

        cancelButton.addActionListener(this);
        ListByNameButton.addActionListener(this);
        ListBySalaryButton.addActionListener(this);
        ListByBirthdayButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelButton) {
            MyFrame frame = new MyFrame();
            frame.setTitle("IFriend Contact Organizer");
            frame.setLayout(new GridLayout(1, 2));
            frame.setSize(799, 600);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setBackground(Color.WHITE);
            frame.setVisible(true);
            this.setVisible(false);
        }

    }
}
