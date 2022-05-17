package AAKevinKwuestPrototypeAlpha;

import javax.swing.*;
import java.awt.*;

public class Adventure {
    private Enemy curEnemy;
    private Character player;

    public static void main(String[] args){

    }


    public Adventure(JFrame gameWindow){
        player = new Character();
        gameWindow.setVisible(true);
        engageBattle(gameWindow);
    }

    public void engageBattle(JFrame gameWindow){
        new Battle(new EnemyList().get(0), player, gameWindow);
    }

}
