package AAKevinKwuestPrototypeAlpha;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;


public class Battle {
    private static Enemy opponent;
    private static boolean isTurn;
    private static Character player;
    private static Timer playerICD;
    private static TimerTask playerICDReset;



    public Battle(Enemy e, Character k, JFrame window){
        new BattleGUI(window);
        player = k;
        opponent = e;
        isTurn = true;

    }


    public static void attack(){
        if (isTurn) {
            opponent.getStat().takeDamage(player.getDamage());
            if (opponent.getStat().isAlive == false){
                System.out.println("Enemy died");
            }

            else {
                System.out.println("Opp took " + player.getDamage() + " damage" + " and has HP: " + opponent.getStat().returnCurHP());
                isTurn = false;
                takeAttack();
            }
        }

        else {
            System.out.println("Opponent is deciding");
        }
    }

    public static void takeAttack(){
         player.takeDamage(opponent.getStat().returnStr());
            if (player.getStat().isAlive == false){
                System.out.println("Player died");
            }

            else {
                System.out.println("Player took " + opponent.getStat().returnStr() + " damage" + " and has HP: " + player.getStat().returnCurHP());
                playerICD = new Timer();
                playerICDReset = new TimerTask() {
                    @Override
                    public void run() {
                        isTurn = true;
                    }
                };
                // Will have to wait 1.5 seconds because player can attack each time
                playerICD.schedule(playerICDReset, 1500);
            }
    }



}
