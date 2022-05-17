package AAKevinKwuestPrototypeAlpha;

public class Character {
    private Stats stat;
    private Equipment curGear;
    private String name;

    public Character(){
        stat = new Stats(10, 2);
        curGear = new Equipment();
        name = "Kevin";
    }

    public int getDamage(){
        return curGear.returnDamage() + stat.returnStr();
    }

    public void takeDamage(int hit){
        stat.takeDamage(hit);
    }

    public Stats getStat(){
        return stat;
    }
}
