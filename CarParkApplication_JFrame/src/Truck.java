import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Truck extends JFrame implements ActionListener {
    FileWriter fw = new FileWriter("garage.txt",true );

    PrintWriter pw = new PrintWriter(fw);

    File file = new File("garage.txt");

    int price = 20;

    JLabel model;
    JLabel enteredTime;
    JLabel duration;
    JTextField modelText;
    JTextField timeText;
    JTextField durationText;
    JButton submit;
    JButton back;
    JOptionPane optionPane;
    JOptionPane optionPane1;
    JOptionPane optionPane2;
    JOptionPane optionPane3;
    JOptionPane optionPane4;

    Truck() throws IOException {
        ImageIcon icon = new ImageIcon("mainmenu.jpg");

        model = new JLabel("Model Name ");
        model.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        model.setBounds(10,10,120,50);

        modelText = new JTextField();
        modelText.setBounds(140,20,200,30);
        modelText.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        modelText.setForeground(Color.WHITE);
        modelText.setBackground(Color.BLACK);
        modelText.setCaretColor(Color.WHITE);


        enteredTime = new JLabel("Entered Time ");
        enteredTime.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        enteredTime.setBounds(10,50,120,50);

        timeText = new JTextField();
        timeText.setBounds(140,60,200,30);
        timeText.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        timeText.setForeground(Color.WHITE);
        timeText.setBackground(Color.BLACK);
        timeText.setCaretColor(Color.WHITE);


        duration = new JLabel("Duration ");
        duration.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        duration.setBounds(10,90,120,50);

        durationText = new JTextField();
        durationText.setBounds(140,100,200,30);
        durationText.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        durationText.setForeground(Color.WHITE);
        durationText.setBackground(Color.BLACK);
        durationText.setCaretColor(Color.WHITE);


        submit = new JButton("SUBMIT");
        submit.setBounds(10,150,330,40);
        submit.setFont(new Font(Font.SERIF,Font.BOLD,30));
        submit.setFocusable(false);
        submit.setForeground(Color.white);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(this);

        back = new JButton("MAIN MENU");
        back.setBounds(10,210,330,40);
        back.setFont(new Font(Font.SERIF,Font.BOLD,30));
        back.setFocusable(false);
        back.setForeground(Color.white);
        back.setBackground(Color.RED);
        back.addActionListener(this);

        this.add(model);
        this.add(modelText);
        this.add(enteredTime);
        this.add(timeText);
        this.add(duration);
        this.add(durationText);
        this.add(submit);
        this.add(back);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(370,320);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.orange);
        this.setTitle("Car");
        this.setIconImage(icon.getImage());
        this.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==submit){
            if (!modelText.getText().isEmpty()){
                if (!timeText.getText().isEmpty()){
                    if (!durationText.getText().isEmpty()){
                        try {
                            optionPane.showMessageDialog(null,"Your pay is: " + ( Integer.valueOf(durationText.getText()) * price + "$") , "Park Fee",JOptionPane.INFORMATION_MESSAGE);
                        }catch (Exception a){
                            optionPane4.showMessageDialog(null,"You entered the duration in false data type","ERROR",JOptionPane.WARNING_MESSAGE);
                        }
                        pw.print("Model: " + modelText.getText() + "    " + "Entered Time: " + timeText.getText() + "\n");
                        pw.close();
                        System.exit(0);
                    }else optionPane1.showMessageDialog(null,"Please enter the duration","ERROR",JOptionPane.ERROR_MESSAGE);
                }else optionPane2.showMessageDialog(null,"Please enter the entered time","ERROR",JOptionPane.ERROR_MESSAGE);
            }else optionPane3.showMessageDialog(null,"Please enter the model name","ERROR",JOptionPane.ERROR_MESSAGE);


        } else if (e.getSource()==back) {
            this.dispose();
            MainMenu mainMenu = new MainMenu();
        }


    }
}
