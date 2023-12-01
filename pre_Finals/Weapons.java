package pre_Finals;

public class Weapons {
	private String sword;
	private String bareHands;
	private String bow;
	private String shield;
	private int bareHandsDamage;
	private int swordDamage;
	private int bowDamage;

	public void setSwordName(String swordName) {
		this.sword = swordName;

	}

	public String getSwordName() {
		return sword;
	}

	public void setBowName(String bowName) {
		this.bow = bowName;
	}

	public String getBowName() {
		return bow;
	}

	public void setBareHandsName(String hands) {
		this.bareHands = hands;
	}

	public String getBareHandsName() {
		return bareHands;
	}

	public void setSwordDamage(int swordDamage) {
		this.swordDamage = swordDamage;
	}

	public int getSwordDamage() {
		return swordDamage;

	}

	public void setBowDamage(int bowDamage) {
		this.bowDamage = bowDamage;
	}

	public int getBowDamage() {
		return bowDamage;
	}

	public void setBareHandsDamage(int bareHandsDamage) {
		this.bareHandsDamage = bareHandsDamage;
	}

	public int getbareHandsDamage() {
		return bareHandsDamage;
	}

}
