package AAKevinKwuestPrototypeAlpha;

public class Stats {
    private int curHP;
    private int health;
    private int strength;
    public boolean isAlive;


    public Stats(int hp, int str){
        health = hp;
        curHP = health;
        strength = str;
        isAlive = true;
    }

    public int returnStr(){
        return strength;
    }

    public int returnCurHP(){
        return curHP;
    }

    public void takeDamage(int hit){
        curHP -= hit;
        if (curHP <= 0){
            isAlive = false;
        }
    }
}
