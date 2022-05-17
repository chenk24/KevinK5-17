package AAKevinKwuestPrototypeAlpha;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StartingWindow extends JFrame implements ActionListener {

    JFrame gameWindow;
    Container startScreenCon;
    JPanel titleNamePanel;
    ImageIcon backgroundImage;
    ImageIcon startImage;
    JLabel displayField;
    JLabel displayField2;
    JButton startButton;
    JLayeredPane layers;

    public static void main(String[] args) {
        new StartingWindow();

    }

    public StartingWindow() {


        // opens up the window for the game
        gameWindow = new JFrame("Kevin Kwuest");
        gameWindow.setSize(1920, 1080);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setBackground(Color.black);
        gameWindow.setLayout(null);
        startScreenCon = gameWindow.getContentPane();
        createBackground();
        createStartButton();
        startScreenCon.add(layers);
        gameWindow.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startScreenCon.removeAll();
            gameWindow.setVisible(false);
            new Adventure(gameWindow);
        }
    }

    public void createBackground(){
        try {
            backgroundImage = new ImageIcon(this.getClass().getResource("KKStartBackground1.0.png"));
            displayField = new JLabel(backgroundImage);
            displayField.setSize(1920, 1080);
            layers = new JLayeredPane();
            layers.setBounds(0, 0, 1920, 1080);
            layers.add(displayField, Integer.valueOf(1));
        }

        catch (Exception e){
            System.out.print("No image found");
        }
    }

    public void createStartButton(){
        try {
            startImage = new ImageIcon(this.getClass().getResource("KKStartingScreenStartButton1.0.png"));
            displayField2 = new JLabel(startImage);
            displayField2.setBounds(0, 0, 1920, 1080);
            layers.add(displayField2, Integer.valueOf(3));
        } catch (Exception e) {
            System.out.print("No image found");
        }


        //the start button
        startButton = new JButton("Start");
        startButton.setBounds(1920 / 2 - 320 / 2, 1080 / 2 - 125 / 2, 320, 125);
        startScreenCon.add(startButton);
        startButton.addActionListener(this);
        layers.add(startButton, Integer.valueOf(0));

    }
}
