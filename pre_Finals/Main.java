package pre_Finals;

import java.util.Scanner;

public class Main extends Player implements GameType, Actions, EnemyAction {
	static Scanner scn = new Scanner(System.in);
	static Villain villains = new Villain();
	static Player player = new Player();
	static Weapons weapons = new Weapons();
	static String name;

	public static void main(String[] args) throws InterruptedException {
		System.out.print("Enter a name: ");
		name = scn.nextLine();

		System.out.println("Press 1 or 2 to select your game mode.");
		System.out.println("1 - Story mode");
		System.out.println("2 - Survival mode");
		String gameMode = scn.next();

		if (gameMode.equals("1")) {
			System.out.println("Press P to start playing, " + name);
			String start = scn.next().toUpperCase();
			if (start.equals("P")) {
				storyMode();
			}
		} else if (gameMode.equals("2")) {
			System.out.println("Enter diffucilty [1] EASY [2] MEDIUM [3] HARD ");
			String difficulty = scn.next();
			if (difficulty.equals("1")) {
				Easy();
			} else if (difficulty.equals("2")) {
				Medium();
			} else if (difficulty.equals("3")) {
				Hard();
			}
		}

	}// end of main method

	public static void storyMode() {
		System.out.println("Welcome to Story Mode!");
		System.out.println("You find yourself at the entrance of a mysterious cave.");

		System.out.println("Do you want to enter the cave?[Y] for yes [N] for no");
		String enter = scn.next().toUpperCase();

		if (enter.equals("Y")) {
			System.out.println("You enter the cave and discover two paths.");
			System.out.println("1. Go left");
			System.out.println("2. Go right");
			System.out.print("Enter your choice (1 or 2): ");
			int pathChoice = scn.nextInt();

			if (pathChoice == 1) {
				System.out.println("You find a treasure chest!");
				System.out.println("Congratulations, you've completed the adventure!");
			} else if (pathChoice == 2) {
				System.out.println("You encounter a fierce dragon!");
				System.out.println("Unfortunately, the dragon defeats you. Game over!");
			} else {
				System.out.println("Invalid choice. Game over!");
			}
		} else {
			System.out.println("You decide not to enter the cave. The adventure ends here.");
		}
	}

	public static void playerInfo(int health, int stamina, int damage) {
		player.setMaxHealth(100);
		player.setStamina(50);
		player.getDamage();

	}

	public static void easyExacalibur(String villainName, int damage, int health) {
		villains.setVillainName("Excalibur");
		villains.setDamage(10);
		villains.setHealth(50);

	}

	public static void easyBriaruis(String villainName, int damage, int health) {
		villains.setVillainName("Briaruis");
		villains.setDamage(15);
		villains.setHealth(70);

	}

	public static void easyEpirus(String villainName, int damage, int health) {
		villains.setVillainName("Epirus");
		villains.setDamage(15);
		villains.setHealth(50);

	}

	public static void mediumExcalibur(String villainName, int damage, int health) {
		villains.setVillainName("Excalibur");
		villains.setHealth(30);
		villains.setDamage(20);
		;
	}

	public static void mediumBriaruis(String villainName, int damage, int health) {
		villains.setVillainName("Excalibur");
		villains.setHealth(30);
		villains.setDamage(25);

		;
	}

	public static void mediumEpirus(String villainName, int damage, int healthj) {
		villains.setVillainName("Excalibur");
		villains.setHealth(30);
		villains.setDamage(30);
		;
	}

	public static void hardExcalibur(String villainName, int damage, int healthj) {
		villains.setHealth(50);
		villains.setDamage(35);
	}

	public static void hardBriaruis(String villainName, int damage, int healthj) {
		villains.setHealth(50);
		villains.setDamage(35);
	}

	public static void hardEpirus(String villainName, int damage, int healthj) {
		villains.setHealth(50);
		villains.setDamage(40);
	}

	public static void Easy() { // EASY MODE
		System.out.println("Pree P to start playing, " + name);
		String choices = scn.next().toUpperCase();
		if (choices.equals("P")) {
			System.out.println("It was a starry night when " + name
					+ " wake up, dark always and smoky floor, when suddenly an unexpected strange creature appears "
					+ " ");

			System.out.println("Villain 1: ");
			easyExacalibur(villains.getVillainName(), villains.getDamage(), villains.getHealth());
			System.out.println(villains.getVillainName());
			System.out.println("Health: " + villains.getHealth());
			System.out.println("Damage: " + villains.getDamage());
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(name + "Health");
			playerInfo(player.getMaxHealth(), player.getDamage(), player.getStamina());
			System.out.println("Health: " + player.getMaxHealth());
			System.out.println("Damage: " + player.getDamage());
			System.out.println("Stamina: " + player.getStamina());
			do {
				Attack();
			} while (villains.getHealth() > 0);

			System.out.println(" ");
			System.out.println("FIRST VILLAIN WAS EXECUTED, ANOTHER VILLAIN APPEAR.");
			// VILLAIN 1 DEFEATED
			System.out.println(" ");

			System.out.println("Villain 2: ");
			easyBriaruis(villains.getVillainName(), villains.getDamage(), villains.getHealth());
			System.out.println(villains.getVillainName());
			System.out.println("Health: " + villains.getHealth());
			System.out.println("Damage: " + villains.getDamage());
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(name + "Health");
			playerInfo(player.getMaxHealth(), player.getDamage(), player.getStamina());
			System.out.println("Health: " + player.getMaxHealth());
			System.out.println("Damage: " + player.getDamage());
			System.out.println("Stamina: " + player.getStamina());
			do {
				Attack();
			} while (villains.getHealth() > 0);
			System.out.println(" ");
			System.out.println("SECOND VILLAIN WAS EXECUTED, ANOTHER VILLAIN APPEAR.");
			System.out.println("FINAL VILLAIN FOR THIS LEVEL");
			// VILLAIN 2 DEFEATED
			System.out.println(" ");

			System.out.println("Villain 3: ");
			easyEpirus(villains.getVillainName(), villains.getDamage(), villains.getHealth());
			System.out.println(villains.getVillainName());
			System.out.println("Health: " + villains.getHealth());
			System.out.println("Damage: " + villains.getDamage());
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(name + "Health");
			playerInfo(player.getMaxHealth(), player.getDamage(), player.getStamina());
			System.out.println("Health: " + player.getMaxHealth());
			System.out.println("Damage: " + player.getDamage());
			System.out.println("Stamina: " + player.getStamina());
			do {
				Attack();

				if (player.getCurrentHealth() < 0) {
					System.out.println("Game over");
					System.exit(0);
				}
			} while (villains.getHealth() > 0);
			System.out.println("YOU FINISHED THE GAME!");

		}
	}// end of easy method

	public static void Medium() { // MEDIUM MODE
		System.out.println("Pree P to start playing, " + name);
		String choices = scn.next().toUpperCase();
		if (choices.equals("P")) {
			System.out.println("It was a starry night when " + name
					+ " wake up, dark always and smoky floor, when suddenly an unexpected strange creature appears "
					+ " ");

			System.out.println("Villain 1: ");
			mediumExcalibur(villains.getVillainName(), villains.getDamage(), villains.getHealth());
			System.out.println(villains.getVillainName());
			System.out.println("Health: " + villains.getHealth());
			System.out.println("Damage: " + villains.getDamage());
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(name + "Health");
			playerInfo(player.getMaxHealth(), player.getDamage(), player.getStamina());
			System.out.println("Health: " + player.getMaxHealth());
			System.out.println("Damage: " + player.getDamage());
			System.out.println("Stamina: " + player.getStamina());
			do {
				Attack();
			} while (villains.getHealth() > 0);

			System.out.println(" ");
			System.out.println("FIRST VILLAIN WAS EXECUTED, ANOTHER VILLAIN APPEAR.");
			// VILLAIN 1 DEFEATED
			System.out.println(" ");

			System.out.println("Villain 2: ");
			mediumBriaruis(villains.getVillainName(), villains.getDamage(), villains.getHealth());
			System.out.println(villains.getVillainName());
			System.out.println("Health: " + villains.getHealth());
			System.out.println("Damage: " + villains.getDamage());
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(name + "Health");
			playerInfo(player.getMaxHealth(), player.getDamage(), player.getStamina());
			System.out.println("Health: " + player.getMaxHealth());
			System.out.println("Damage: " + player.getDamage());
			System.out.println("Stamina: " + player.getStamina());
			do {
				Attack();
			} while (villains.getHealth() > 0);
			System.out.println(" ");
			System.out.println("SECOND VILLAIN WAS EXECUTED, ANOTHER VILLAIN APPEAR.");
			System.out.println("FINAL VILLAIN FOR THIS LEVEL");
			// VILLAIN 2 DEFEATED
			System.out.println(" ");

			System.out.println("Villain 3: ");
			mediumEpirus(villains.getVillainName(), villains.getDamage(), villains.getHealth());
			System.out.println(villains.getVillainName());
			System.out.println("Health: " + villains.getHealth());
			System.out.println("Damage: " + villains.getDamage());
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(name + "Health");
			playerInfo(player.getMaxHealth(), player.getDamage(), player.getStamina());
			System.out.println("Health: " + player.getMaxHealth());
			System.out.println("Damage: " + player.getDamage());
			System.out.println("Stamina: " + player.getStamina());
			do {
				Attack();

			} while (villains.getHealth() > 0);

		}

	} // end of medium method

	public static void Hard() { // MEDIUM MODE
		System.out.println("Pree P to start playing, " + name);
		String choices = scn.next().toUpperCase();
		if (choices.equals("P")) {
			System.out.println("It was a starry night when " + name
					+ " wake up, dark always and smoky floor, when suddenly an unexpected strange creature appears "
					+ " ");

			System.out.println("Villain 1: ");
			hardExcalibur(villains.getVillainName(), villains.getDamage(), villains.getHealth());
			System.out.println(villains.getVillainName());
			System.out.println("Health: " + villains.getHealth());
			System.out.println("Damage: " + villains.getDamage());
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(name + "Health");
			playerInfo(player.getMaxHealth(), player.getDamage(), player.getStamina());
			System.out.println("Health: " + player.getMaxHealth());
			System.out.println("Damage: " + player.getDamage());
			System.out.println("Stamina: " + player.getStamina());
			do {
				Attack();
			} while (villains.getHealth() > 0);

			System.out.println(" ");
			System.out.println("FIRST VILLAIN WAS EXECUTED, ANOTHER VILLAIN APPEAR.");
			// VILLAIN 1 DEFEATED
			System.out.println(" ");

			System.out.println("Villain 2: ");
			hardBriaruis(villains.getVillainName(), villains.getDamage(), villains.getHealth());
			System.out.println(villains.getVillainName());
			System.out.println("Health: " + villains.getHealth());
			System.out.println("Damage: " + villains.getDamage());
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(name + "Health");
			playerInfo(player.getMaxHealth(), player.getDamage(), player.getStamina());
			System.out.println("Health: " + player.getMaxHealth());
			System.out.println("Damage: " + player.getDamage());
			System.out.println("Stamina: " + player.getStamina());
			do {
				Attack();
			} while (villains.getHealth() > 0);
			System.out.println(" ");
			System.out.println("SECOND VILLAIN WAS EXECUTED, ANOTHER VILLAIN APPEAR.");
			System.out.println("FINAL VILLAIN FOR THIS LEVEL");
			// VILLAIN 2 DEFEATED
			System.out.println(" ");

			System.out.println("Villain 3: ");
			hardEpirus(villains.getVillainName(), villains.getDamage(), villains.getHealth());
			System.out.println(villains.getVillainName());
			System.out.println("Health: " + villains.getHealth());
			System.out.println("Damage: " + villains.getDamage());
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(name + "Health");
			playerInfo(player.getMaxHealth(), player.getDamage(), player.getStamina());
			System.out.println("Health: " + player.getMaxHealth());
			System.out.println("Damage: " + player.getDamage());
			System.out.println("Stamina: " + player.getStamina());
			do {
				Attack();

			} while (villains.getHealth() > 0);

		}
	} // end of medium method

	public static void punch() {
		player.setDamage(5);
		villains.setHealth(villains.getHealth() - player.getDamage());
		player.setMaxHealth(player.getMaxHealth() - villains.getDamage());

		System.out.println("You choose PUNCH, the enemy dealth 5 hp ");
		System.out.println(villains.getVillainName());
		System.out.println("Health: " + villains.getHealth());
		System.out.println("Damage: " + villains.getDamage());
		System.out.println("--------------------------------------------------------------------------");

		System.out.println("The enemy deal a damage of 10 to you.");
		System.out.println(name);
		System.out.println("Health: " + player.getMaxHealth());
		System.out.println("Damage: " + player.getDamage());
		System.out.println("Stamina: " + player.getStamina());
	}

	public static void gauntlet() {

		weapons.setBareHandsDamage(10);

		player.setDamage(weapons.getbareHandsDamage());
		villains.setHealth(villains.getHealth() - player.getDamage());
		player.setMaxHealth(player.getMaxHealth() - villains.getDamage());
		System.out.println("You choose GAUNTLET, the enemy dealth 10 hp ");
		System.out.println(villains.getVillainName());
		System.out.println("Health: " + villains.getHealth());
		System.out.println("Damage: " + villains.getDamage());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("The enemy deal a damage of 10 to you.");
		System.out.println(name);
		System.out.println("Health: " + player.getMaxHealth());
		System.out.println("Damage: " + player.getDamage());
		player.setStamina(player.getStamina() - 10);
		System.out.println("Stamina: " + player.getStamina());

	}// end of gauntlet method

	public static void slash() {
		weapons.setSwordDamage(20);
		player.setDamage(weapons.getSwordDamage());
		villains.setHealth(villains.getHealth() - player.getDamage());
		player.setMaxHealth(player.getMaxHealth() - villains.getDamage());
		System.out.println("You choose SLASH, the enemy dealth 10 hp ");
		System.out.println(villains.getVillainName());
		System.out.println("Health: " + villains.getHealth());
		System.out.println("Damage: " + villains.getDamage());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("The enemy deal a damage of 10 to you.");
		System.out.println(name);
		System.out.println("Health: " + player.getMaxHealth());
		System.out.println("Damage: " + player.getDamage());
		player.setStamina(player.getStamina() - 15);
		System.out.println("Stamina: " + player.getStamina());

	}// end of slash method

	public static void focusFire() {
		weapons.setBowDamage(25);
		player.setDamage(weapons.getBowDamage());
		villains.setHealth(villains.getHealth() - player.getDamage());
		player.setMaxHealth(player.getMaxHealth() - villains.getDamage());
		System.out.println("You choose FOCUS FIRE, the enemy dealth 10 hp ");
		System.out.println(villains.getVillainName());
		System.out.println("Health: " + villains.getHealth());
		System.out.println("Damage: " + villains.getDamage());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("The enemy deal a damage of 10 to you.");
		System.out.println(name);
		System.out.println("Health: " + player.getMaxHealth());
		System.out.println("Damage: " + player.getDamage());
		player.setStamina(player.getStamina() - 25);
		System.out.println("Stamina: " + player.getStamina());

	}// end of slash method

	public static void Attack() {

		System.out.println(
				"Press [1] to PUNCH 	[2] to use GAUNTLET 	[3] to use SLASH 	[4] to use FOCUS FIRE 	[5] to use HEAL 	[6] to use DEFENSE");
		String choosing = scn.next();
		if (choosing.equals("1")) {
			punch();
		} else if (choosing.equals("2")) {
			gauntlet();
		} else if (choosing.equals("3")) {
			slash();
		} else if (choosing.equals("4")) {
			focusFire();
		} else if (choosing.equals("5")) {
			heal();
		} else if (choosing.equals("6")) {
			defense();
		}
	}// end of attack method

	public static void heal() {
		player.setDamage(0);
		villains.setHealth(villains.getHealth() - player.getDamage());
		player.setCurrentHealth(player.getCurrentHealth() + 10);
		player.setStamina(player.getStamina());
		System.out.println("You're HEAL was successfully used. ");
		System.out.println(villains.getVillainName());
		System.out.println("Health: " + villains.getHealth());
		System.out.println("Damage: " + villains.getDamage());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(name);
		System.out.println("Health: " + player.getCurrentHealth());
		System.out.println("Damage: " + player.getDamage());
		System.out.println("Stamina: " + player.getStamina());

	}// end of heal method

	public static void defense() {
		player.setDamage(0);
		villains.setHealth(villains.getHealth() - player.getDamage());
		player.setCurrentHealth(player.getCurrentHealth());
		player.setStamina(player.getStamina() + 10);
		System.out.println("You're HEAL was successfully used. ");
		System.out.println(villains.getVillainName());
		System.out.println("Health: " + villains.getHealth());
		System.out.println("Damage: " + villains.getDamage());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(name);
		System.out.println("Health: " + player.getCurrentHealth());
		System.out.println("Damage: " + player.getDamage());
		System.out.println("Stamina: " + player.getStamina());
	}

	public void enemyAttack() {

	}

}
