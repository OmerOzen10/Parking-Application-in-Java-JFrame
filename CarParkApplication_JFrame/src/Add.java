import javax.swing.*;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Add extends JFrame implements ActionListener {

    JLabel label;
    JButton carButton;
    JButton bicycleButton;
    JButton truckButton;
    JButton backButton;

    Add(){
        ImageIcon icon = new ImageIcon("mainmenu.jpg");

        label = new JLabel("Choose your Vehicle");
        label.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        label.setBounds(65,25,350,50);

        carButton= new JButton("Car");
        carButton.setBounds(35,100,310,50);
        carButton.setFont(new Font(Font.SERIF,Font.BOLD,30));
        carButton.setFocusable(false);
        carButton.setForeground(Color.white);
        carButton.setBackground(Color.BLACK);
        carButton.addActionListener(this);

        bicycleButton= new JButton("Bicycle");
        bicycleButton.setBounds(35,175,310,50);
        bicycleButton.setFont(new Font(Font.SERIF,Font.BOLD,30));
        bicycleButton.setFocusable(false);
        bicycleButton.setForeground(Color.WHITE);
        bicycleButton.setBackground(Color.BLACK);
        bicycleButton.addActionListener(this);

        truckButton= new JButton("Truck");
        truckButton.setBounds(35,250,310,50);
        truckButton.setFont(new Font(Font.SERIF,Font.BOLD,30));
        truckButton.setFocusable(false);
        truckButton.setForeground(Color.WHITE);
        truckButton.setBackground(Color.BLACK);
        truckButton.addActionListener(this);

        backButton= new JButton("Main Menu");
        backButton.setBounds(35,325,310,50);
        backButton.setFont(new Font(Font.SERIF,Font.BOLD,30));
        backButton.setFocusable(false);
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(Color.red);
        backButton.addActionListener(this);

        this.add(label);
        this.add(carButton);
        this.add(bicycleButton);
        this.add(truckButton);
        this.add(backButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,450);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setTitle("Vehicle");
        this.setIconImage(icon.getImage());
        this.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==carButton){
            this.dispose();
            try {
                Car car = new Car();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        } else if (e.getSource()==bicycleButton) {
            this.dispose();
            try {
                Bicycle bicycle = new Bicycle();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        } else if (e.getSource()==truckButton) {
            this.dispose();
            try {
                Truck truck = new Truck();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        } else if (e.getSource()==backButton) {
            this.dispose();
            MainMenu mainMenu = new MainMenu();
        }

    }
}
