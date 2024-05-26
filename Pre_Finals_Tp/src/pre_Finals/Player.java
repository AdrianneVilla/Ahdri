package pre_Finals;

public class Player extends Stats {

	public int maxHealth;
	public int stamina;
	public int damage;
	public int currentHealth;
	public int currentStamina;

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setMaxHealth(int health) {
		this.maxHealth = health;
	}

	public int getMaxHealth() {
		if (maxHealth < 0) {
			maxHealth = 0;
			System.out.println("GAME OVER!");
			System.exit(0);
		}
		return maxHealth;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getStamina() {
		return stamina;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

}
