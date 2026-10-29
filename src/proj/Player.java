package proj;

    class Player extends GameObject {

	private String name;
    private int health;
    
    
	
	public Player(int x, int y, int width, int height, String name, int health) {
		super(x, y, width, height);
		this.name = name;
		this.health = health;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
		if (name == null || name.trim().isEmpty()) {
		    throw new IllegalArgumentException("Ime ne smije biti prazno");
		}

		name = name.trim();

		String[] dijelovi = name.split(" ");
		for (int i = 0; i < dijelovi.length; i++) {
		    dijelovi[i] = dijelovi[i].substring(0,1).toUpperCase() +
		                  dijelovi[i].substring(1).toLowerCase();	
		}
	}

	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		
		    if (health < 0) health = 0;
		    if (health > 100) health = 100;
		    this.health = health;
		}

		@Override
		public String toString() {
		    return "Player(" + name + ") @ (" + getX() + "," + getY() + ") "
		           + getWidth() + "x" + getHeight() + " HP=" + health;
		}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
