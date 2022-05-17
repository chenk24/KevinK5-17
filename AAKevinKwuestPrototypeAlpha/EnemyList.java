package AAKevinKwuestPrototypeAlpha;

import java.util.*;

public class EnemyList {
    private ArrayList<Enemy> allEnemies;

    public EnemyList(){
        allEnemies = new ArrayList<>();
        allEnemies.add(new Enemy(1, "Slime", 5, 1));
        allEnemies.add(new Enemy(2, "Goblin", 8, 2));
    }

    public Enemy get(int index){
        return allEnemies.get(index);
    }
}
