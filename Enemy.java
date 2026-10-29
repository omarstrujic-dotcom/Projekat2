package proj;

public class Enemy extends GameObject {

	public Enemy(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public Enemy(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	private String type;
	private int damage;
	private int health;
	

	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;

	    if (damage < 0) damage = 0;
	    if (damage > 100) damage = 100;
	    this.damage = damage;
	}



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;

	    if (health < 0) health = 0;
	    if (health > 100) health = 100;
	    this.health = health;
	}

	public String toString() {
        return "Enemy[" + type + "] DMG=" + damage + " HP=" + health;
    }

	public static void main1(String[] args) {
        Enemy goblin = new Enemy("Goblin", 20, 60);
        System.out.println(goblin);
    }






public static void main(String[] args) {
	// TODO Auto-generated method stub
    }

}
