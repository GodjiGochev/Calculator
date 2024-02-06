package srcc;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    //Code for the frame
    JFrame frame;
    JTextField textField;
    //Code for the buttons
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, delButton, clrButton, equButton;
    //Code for panel
    JPanel panel;
    //My font style
    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    //Vars for the numbers that I will use later
    double number1 = 0, number2 = 0, result = 0;
    char operator;
    Calculator(){
        frame = new JFrame("The Best Calculator Ever");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);

        frame.add(textField);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
