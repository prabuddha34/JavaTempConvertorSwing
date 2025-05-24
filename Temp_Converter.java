import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temp_Converter extends JFrame implements ActionListener {

    JPanel panel;
    JButton kelvinButton, FahrenheitButton;
    JTextField textField;
    JLabel label;

    Temp_Converter() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setTitle("Temperature Converter");
        this.setLayout(null);

        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        panel.setBounds(50, 50, 300, 300);

        textField=new JTextField("Enter the Temperature in celcius");
        textField.setBounds(100, 150, 200, 25);

        label=new JLabel("Temperature Convertor");
        label.setBounds(60, 20, 200, 25);


        kelvinButton = new JButton("Kelvin");
        FahrenheitButton = new JButton("Fahrenheit");

        kelvinButton.setBounds(50, 150, 100, 30);
        FahrenheitButton.setBounds(190, 150, 100, 30);

        kelvinButton.addActionListener(this);
        FahrenheitButton.addActionListener(this);

        kelvinButton.setFocusable(false);
        FahrenheitButton.setFocusable(false);

        panel.add(kelvinButton);
        panel.add(FahrenheitButton);

        this.add(panel);
        this.add(label);
        this.add(textField);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num,num1;
        num1= Double.parseDouble(textField.getText());
        if(e.getSource()==kelvinButton){
            num=num1+273;
            JOptionPane.showMessageDialog(this,"The Value is"+" "+num+" K");
        }
        if(e.getSource()==FahrenheitButton)
        {
            num=(num1 * 9/5) + 32;
            JOptionPane.showMessageDialog(this,"The Value is"+" "+num+" F");
        }
    }

    public static void main(String[] args) {
        new Temp_Converter();
    }
}
