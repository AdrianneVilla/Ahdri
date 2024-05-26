package movieTime;

import java.util.*;

public class MovieTIme {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Queue<String> movies = new LinkedList<>();
		Queue<String> snacks = new LinkedList<>();

		for (int mov = 1; mov <= 3; mov++) {
			System.out.println("Enter movie " + mov + " of 3: ");
			String movie = scn.nextLine();
			movies.offer(movie);
			
		}

		for (int Snack = 1; Snack <= 3; Snack++) {
			System.out.println("Enter snack " + Snack + " of 3: ");
			String snack = scn.nextLine();
			snacks.offer(snack);
		}

		System.out.println("Movies to watch are: deque(" + movies + ")");
		System.out.println("Snacks available are: deque(" + snacks + ")");

		for (int finish = snacks.size(); finish >= 1; finish--) {
			System.out.println("Press S each time you finish a snack.");
			String eat = scn.nextLine();
			if (eat.equalsIgnoreCase("S")) {
				snacks.poll();
				System.out.println(snacks);
				if (snacks.isEmpty()) {
					System.out.println("NO MORE SNACKS!");

					System.out.println("Do you want to add a snack? Y[Yes] N [No]");
					String choices = scn.next();

				}

			}
		}
	}
}
