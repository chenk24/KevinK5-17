package AAKevinKwuestPrototypeAlpha;

public class Equipment {
    private Weapon weapon;

    public Equipment(){
        weapon = new Weapon();
    }

    public int returnDamage(){
        return weapon.returnDamage();
    }
}
