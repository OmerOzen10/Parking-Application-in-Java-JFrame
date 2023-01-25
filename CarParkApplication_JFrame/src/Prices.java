import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prices extends JFrame implements ActionListener{
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JButton button;


    Prices(){
        ImageIcon icon = new ImageIcon("mainmenu.jpg");

        label1 = new JLabel("PRICES");
        label1.setFont(new Font(Font.SERIF,Font.BOLD,40));
        label1.setBounds(115,25,350,50);

        label2 = new JLabel("CAR               =          10$");
        label2.setFont(new Font(Font.SERIF,Font.BOLD,30));
        label2.setBounds(30,120,350,50);
        label2.setForeground(Color.blue);

        label3 = new JLabel("BICYCLE      =          5$");
        label3.setFont(new Font(Font.SERIF,Font.BOLD,30));
        label3.setBounds(30,180,350,50);
        label3.setForeground(Color.blue);

        label4 = new JLabel("TRUCK          =         20$");
        label4.setFont(new Font(Font.SERIF,Font.BOLD,30));
        label4.setBounds(30,240,350,50);
        label4.setForeground(Color.blue);

        button = new JButton("MAIN MENU");
        button.setBounds(30,335,330,50);
        button.setFont(new Font(Font.SERIF,Font.BOLD,30));
        button.setFocusable(false);
        button.setForeground(Color.white);
        button.setBackground(Color.RED);
        button.addActionListener(this);


        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400,450);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.orange);
        this.setTitle("Prices");
        this.setIconImage(icon.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            this.dispose();
            MainMenu mainMenu = new MainMenu();
        }

    }
}
