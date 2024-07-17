package com.rupp.calcuator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JTextField firstNumber;
    private JTextField secondNumber;
    private JTextField result;
    private JButton addButton;
    private JButton subButton;
    private JButton mulButton;
    private JButton divButton;
    private JButton clearButton;

    public Calculator() {
        // Frame setup
        frame = new JFrame("Calculator");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // First number input
        firstNumber = new JTextField();
        firstNumber.setBounds(50, 30, 200, 30);
        frame.add(firstNumber);

        // Second number input
        secondNumber = new JTextField();
        secondNumber.setBounds(50, 70, 200, 30);
        frame.add(secondNumber);

        // Result display
        result = new JTextField();
        result.setBounds(50, 110, 200, 30);
        result.setEditable(false);
        frame.add(result);

        // Addition button
        addButton = new JButton("+");
        addButton.setBounds(50, 150, 50, 30);
        frame.add(addButton);

        // Subtraction button
        subButton = new JButton("-");
        subButton.setBounds(110, 150, 50, 30);
        frame.add(subButton);

        // Multiplication button
        mulButton = new JButton("*");
        mulButton.setBounds(170, 150, 50, 30);
        frame.add(mulButton);

        // Division button
        divButton = new JButton("/");
        divButton.setBounds(230, 150, 50, 30);
        frame.add(divButton);

        // Clear button
        clearButton = new JButton("Clear");
        clearButton.setBounds(50, 190, 230, 30);
        frame.add(clearButton);

        // Action listeners
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstNumber.getText());
                double num2 = Double.parseDouble(secondNumber.getText());
                double res = num1 + num2;
                result.setText(Double.toString(res));
            }
        });

        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstNumber.getText());
                double num2 = Double.parseDouble(secondNumber.getText());
                double res = num1 - num2;
                result.setText(Double.toString(res));
            }
        });

        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstNumber.getText());
                double num2 = Double.parseDouble(secondNumber.getText());
                double res = num1 * num2;
                result.setText(Double.toString(res));
            }
        });

        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstNumber.getText());
                double num2 = Double.parseDouble(secondNumber.getText());
                double res = num1 / num2;
                result.setText(Double.toString(res));
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber.setText("");
                secondNumber.setText("");
                result.setText("");
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
