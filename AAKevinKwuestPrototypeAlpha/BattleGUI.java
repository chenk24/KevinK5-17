package AAKevinKwuestPrototypeAlpha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;



public class BattleGUI extends JFrame {
    private JFrame battleWindow;
    private Container battleOverlay;
    private JButton attackButton;
    private JLayeredPane layers;
    private JTextArea healthStatus;
    private JPanel textPanel;
    private Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);

    public static void main(String[] args){
        new BattleGUI();
    }


    public BattleGUI(JFrame window) {
        battleWindow = window;
        battleOverlay = battleWindow.getContentPane();
        createSceneBackground();
        createAttackScreenBackground();
        createAttackButton();
        createHealthScreen();
        battleOverlay.add(layers);
        battleWindow.setVisible(true);
    }

    public BattleGUI(){
        createWindow();
        createSceneBackground();
        createAttackScreenBackground();
        createAttackButton();
        createHealthScreen();
        battleOverlay.add(layers);
        battleWindow.setVisible(true);
    }

    public void createWindow(){
        battleWindow = new JFrame("Kevin Kwuest");
        battleWindow.setSize(1920, 1080);
        battleWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        battleWindow.getContentPane().setBackground(Color.black);
        battleWindow.setLayout(null);
        battleOverlay = battleWindow.getContentPane();
    }

    public void createSceneBackground() {
        try {
            ImageIcon backgroundImage = new ImageIcon(this.getClass().getResource("BattleBackground1.png"));
            JLabel displayField = new JLabel(backgroundImage);
            displayField.setSize(1920, 1080);
            layers = new JLayeredPane();
            layers.setBounds(0, 0, 1920, 1080);
            layers.add(displayField, Integer.valueOf(1));
        } catch (Exception e) {
            System.out.print("No image found");
        }
    }

    public void createAttackScreenBackground(){
        try {
            ImageIcon screenBackgroundImage = new ImageIcon(this.getClass().getResource("BattleScreenBackgroundv1.4.png"));
            JLabel displayField = new JLabel(screenBackgroundImage);
            displayField.setSize(1920, 1080);
            layers.add(displayField, Integer.valueOf(2));
        } catch (Exception e) {
            System.out.print("No image found");
        }
    }

public void createHealthScreen(){

    healthStatus = new JTextArea();
    healthStatus.setBounds(100, 100, 600, 250);
    healthStatus.setBackground(Color.black);
    healthStatus.setForeground(Color.white);
    healthStatus.setFont(normalFont);
    healthStatus.setLineWrap(true);
    healthStatus.setWrapStyleWord(true);
    healthStatus.append("HELLLEOLDODLDODLSODLDODL");
    layers.add(healthStatus, Integer.valueOf(3));



}



    public void createAttackButton(){
        attackButton = new JButton("Attack");
        attackButton.setBounds(1920 / 2 - 320 / 2, 1080 / 2 - 125 / 2, 320, 125);
        attackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == attackButton) {
                    Battle.attack();
                }
            }
        });
        layers.add(attackButton, Integer.valueOf(3));
    }
}

