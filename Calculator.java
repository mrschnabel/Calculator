import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
public class Calculator implements ActionListener {
    JTextField numTxt;
    String num;
    double num1;
    double num2;
    double answ;
    boolean add;
    boolean subtract;
    boolean divide;
    boolean multiply;
    boolean power;
    
    Calculator(){
        num = "";
        answ = 0;
        num1 = 0;
        num2 = 0;
        JFrame frm = new JFrame("Calculator");
        frm.setSize(200, 300);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new FlowLayout());
        numTxt = new JTextField(12);
        
        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton num4 = new JButton("4");
        JButton num5 = new JButton("5");
        JButton num6 = new JButton("6");
        JButton num7 = new JButton("7");
        JButton num8 = new JButton("8");
        JButton num9 = new JButton("9");
        JButton num0 = new JButton("0");
        JButton clear = new JButton("C");
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mult = new JButton("*");
        JButton div = new JButton("/");
        JButton equals = new JButton("=");
        JButton decimal = new JButton(".");
        JButton power = new JButton("^");
        
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        num0.addActionListener(this);
        clear.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        equals.addActionListener(this);
        decimal.addActionListener(this);
        power.addActionListener(this);
        
        frm.add(numTxt);
        frm.add(num1);
        frm.add(num2);
        frm.add(num3);
        frm.add(num4);
        frm.add(num5);
        frm.add(num6);
        frm.add(num7);
        frm.add(num8);
        frm.add(num9);
        frm.add(num0);
        frm.add(decimal);
        frm.add(clear);
        frm.add(add);
        frm.add(sub);
        frm.add(mult);
        frm.add(div);
        frm.add(equals);
        frm.add(power);
        
        
        numTxt.setEditable(false);
        frm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()) {
            case "1":
                num = num + "1";
                numTxt.setText(num);
                break;
            
            case "2":
                num = num + "2";
                numTxt.setText(num);
                break;
                
            case "3":
                num = num + "3";
                numTxt.setText(num);
                break;
                
            case "4":
                num = num + "4";
                numTxt.setText(num);
                break;
                
            case "5":
                num = num + "5";
                numTxt.setText(num);
                break;
                
            case "6":
                num = num + "6";
                numTxt.setText(num);
                break;
                
            case "7":
                num = num + "7";
                numTxt.setText(num);
                break;
                
            case "8":
                num = num + "8";
                numTxt.setText(num);
                break;
                
            case "9":
                num = num + "9";
                numTxt.setText(num);
                break;
                
            case "0":
                num = num + "0";
                numTxt.setText(num);
                break;
                
            case ".":
                num = num + ".";
                numTxt.setText(num);
                break;
                
            case "C":
                num = "";
                answ = 0;
                num1 = 0;
                num2 = 0;
                
                add = false;
                multiply = false;
                subtract = false;
                divide = false;
                power = false;
                
                numTxt.setText(num);
                break;
                
            case "+":
                multiply = false;
                subtract = false;
                divide = false;
                power = false;
                add = true;
                num1 = Double.parseDouble(num);
                num = "";
                break;
                
            case "-":
                add = false;
                multiply = false;
                divide = false;
                power = false;
                subtract = true;
                num1 = Double.parseDouble(num);
                num = "";
                break;
                
            case "*":
                add = false;
                subtract = false;
                divide = false;
                power = false;
                multiply = true;
                num1 = Double.parseDouble(num);
                num = "";
                break;
                
            case "/":
                add = false;
                multiply = false;
                subtract = false;
                power = false;
                divide = true;
                num1 = Double.parseDouble(num);
                num = "";
                break;
                
            case "^":
                add = false;
                multiply = false;
                subtract = false;
                divide = false;
                power = true;
                num1 = Double.parseDouble(num);
                num = "";
                break;
                
            case "=":
               if(add) {
                   num2 = Double.parseDouble(num);
                   answ = num1 + num2;
                   num = Double.toString(answ);
                   numTxt.setText(num);
                   break;
               }
               else if(subtract) {
                   num2 = Double.parseDouble(num);
                   answ = num1 - num2;
                   num = Double.toString(answ);
                   numTxt.setText(num); 
                   break;
               }
               else if (multiply) {
                   num2 = Double.parseDouble(num);
                   answ = num1 * num2;
                   num = Double.toString(answ);
                   numTxt.setText(num); 
                   break;
               }
               else if(divide) {
                   num2 = Double.parseDouble(num);
                   answ = num1 / num2;
                   num = Double.toString(answ);
                   numTxt.setText(num); 
                   break;
               }
               else if(power) {
                   num2 = Double.parseDouble(num);
                   answ = Math.pow(num1, num2);
                   num = Double.toString(answ);
                   numTxt.setText(num); 
                   break;
               }
                
        }
        
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new Calculator();
            }
        });
    }
}
