import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MainMenu extends JFrame implements ActionListener {

    File file = new File("garage.txt");

    JLabel label;

    JButton addButton;
    JButton showButton;
    JButton priceButton;
    JButton exitButton;


    MainMenu(){
        ImageIcon icon = new ImageIcon("mainmenu.jpg");

        label = new JLabel("Welcome to the Garage");
        label.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        label.setBounds(50,25,350,50);

        addButton = new JButton("Parking");
        addButton.setBounds(50,100,280,50);
        addButton.setFocusable(false);
        addButton.setForeground(Color.white);
        addButton.setBackground(Color.BLACK);
        addButton.addActionListener(this);

        showButton = new JButton("Show the Garage");
        showButton.setBounds(50,175,280,50);
        showButton.setFocusable(false);
        showButton.setForeground(Color.white);
        showButton.setBackground(Color.BLACK);
        showButton.addActionListener(this);

        priceButton = new JButton("About the Prices");
        priceButton.setBounds(50,250,280,50);
        priceButton.setFocusable(false);
        priceButton.setForeground(Color.white);
        priceButton.setBackground(Color.BLACK);
        priceButton.addActionListener(this);

        exitButton = new JButton("Exit");
        exitButton.setBounds(50,325,280,50);
        exitButton.setFocusable(false);
        exitButton.setForeground(Color.white);
        exitButton.setBackground(Color.red);
        exitButton.addActionListener(this);

        this.add(addButton);
        this.add(showButton);
        this.add(priceButton);
        this.add(exitButton);

        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400,450);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setTitle("Main Menu");
        this.setIconImage(icon.getImage());
        this.setResizable(false);






    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==addButton){
            this.dispose();
            Add add = new Add();
        } else if (e.getSource()==showButton) {
            this.dispose();

            try {
                Desktop.getDesktop().edit(file);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        } else if (e.getSource()==priceButton) {
            this.dispose();
            Prices prices = new Prices();
        } else if (e.getSource()==exitButton) {
            this.dispose();
            System.exit(0);
        }

    }
}
