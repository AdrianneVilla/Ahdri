package pre_Finals;

public class Villain extends Stats {
	private int health;
	private int maxHealth;
	private int damage;
	private int maxStamina;
	private String villainName;
	private int takenDamage;

	public void setHealth(int health) {
		this.health = health;
		
	
	}

	public int getHealth() {
		if(health < 0) {
			health = 0;
		}
		return health;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setVillainName(String villainName) {
		this.villainName = villainName;
	}

	public String getVillainName() {
		return villainName;
	}

}
