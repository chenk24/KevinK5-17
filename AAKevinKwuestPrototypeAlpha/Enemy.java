package AAKevinKwuestPrototypeAlpha;

public class Enemy {
    private int id;
    private String name;
    private Stats stat;

    public Enemy(int id, String n, int hp, int str){
        this.id = id;
        name = "n";
        stat = new Stats(hp, str);
    }

    public Stats getStat(){
        return stat;
    }
}
