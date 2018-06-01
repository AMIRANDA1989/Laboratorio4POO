/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Divisor;
import Classes.Multiplicador;
import Classes.Restador;
import Classes.Sumador;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author allan
 */
public class GUICalculadora {

    public JFrame f;
    public JButton buttonSum, buttonRes, buttonDiv, buttonMult, buttonBin;
    public int WIDTH = 500, widthTF = 120, widthB = 80;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JTextField textF1, textF2, textResult;

    public void initGui() {
        this.f = new JFrame();

        textF1 = new JTextField();
        textF1.setBounds(50, 40, widthTF, heightTF);

        textF2 = new JTextField();
        textF2.setBounds(200, 40, widthTF, heightTF);

        textResult = new JTextField();
        textResult.setBounds(175, 200, widthTF, heightTF);

        buttonSum = new JButton("+");
        buttonSum.setBounds(0, 115, widthB, heightB);

        buttonRes = new JButton("-");
        buttonRes.setBounds(100, 115, widthB, heightB);

        buttonDiv = new JButton("/");
        buttonDiv.setBounds(200, 115, widthB, heightB);

        buttonMult = new JButton("*");
        buttonMult.setBounds(300, 115, widthB, heightB);

        buttonBin = new JButton("Binario");
        buttonBin.setBounds(400, 115, widthB, heightB);

        textF1.setEditable(true);
        textF2.setEditable(true);

        this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.buttonSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int val1 = Integer.parseInt(textF1.getText());
                int val2 = Integer.parseInt(textF2.getText());
                
                Sumador sum = new Sumador();
                textResult.setText("" + sum.getOperacion(val1, val2));
            }
        });
        
        this.buttonRes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int val1 = Integer.parseInt(textF1.getText());
                int val2 = Integer.parseInt(textF2.getText());
                
                Restador op = new Restador();
                textResult.setText("" + op.getOperacion(val1, val2));
            }
        });
        
        this.buttonDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int val1 = Integer.parseInt(textF1.getText());
                int val2 = Integer.parseInt(textF2.getText());
                
                Divisor op = new Divisor();
                textResult.setText("" + op.getOperacion(val1, val2));
            }
        });
        
        this.buttonMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int val1 = Integer.parseInt(textF1.getText());
                int val2 = Integer.parseInt(textF2.getText());
                
                Multiplicador op = new Multiplicador();
                textResult.setText("" + op.getOperacion(val1, val2));
            }
        });
        
        this.buttonBin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int val1 = Integer.parseInt(textF1.getText());
                //int val2 = Integer.parseInt(textF2.getText());
                
                textResult.setText("" + Integer.toString(val1,2) );
            }
        });

        this.f.add(textF1);
        this.f.add(textF2);
        this.f.add(textResult);
        this.f.add(buttonSum);
        this.f.add(buttonRes);
        this.f.add(buttonDiv);
        this.f.add(buttonMult);
        this.f.add(buttonBin);

        this.f.setSize(WIDTH, HEIGHT);
        this.f.setLayout(null);
        this.f.setVisible(true);

    }
}
