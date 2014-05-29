/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s02.swing_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Countdown extends JFrame {

    private JTextField txtCount;
    private final JButton btnCountdown;
    private JProgressBar process;
    private Timer time;

    public Countdown() {
        this.setLayout(null);
        
        txtCount = new JTextField();
        txtCount.setBounds(20, 20, 150, 30);
        this.getContentPane().add(txtCount);
        
        btnCountdown = new JButton("Countdown");
        btnCountdown.setBounds(190, 20, 120, 30);
        this.getContentPane().add(btnCountdown);
        btnCountdown.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int t = Integer.parseInt(txtCount.getText());
                int delay = t/100;
                time = new Timer(delay, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(process.getValue()>0){
                            process.setValue(process.getValue()-1);
                        }else{
                            time.stop();
                            JOptionPane.showMessageDialog(null, "Done", "Coundown", JOptionPane.WARNING_MESSAGE);
                            process.setValue(process.getMaximum());
                        }
                    }
                });
                time.start();
            }
        });
        
        process = new JProgressBar();
        process.setBounds(20, 70, 290, 30);
        process.setValue(100);
        this.getContentPane().add(process);
        
        this.setSize(340, 140);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Countdown frm = new Countdown();
        frm.setVisible(true);
    }
}
