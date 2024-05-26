package linkedList;

import java.util.*;

public class linkedList {
	public static void main(String[] args) {

		LinkedList<String> songs = new LinkedList<>();
		LinkedList<String> artist = new LinkedList<>();
		LinkedList<String> playlist = new LinkedList<>();

		songs.add("Binhi");
		songs.add("Let me be the one");
		songs.add("Half a man");
		songs.add("Dungaw");
		songs.add("Manatili");

		artist.add("Arthur Nery");
		artist.add("Jimmy Bondoc");
		artist.add("Dean Lewis");
		artist.add("Adie");
		artist.add("Adrianne Villa");

		System.out.println(songs); // printing of songs
		System.out.println(artist); // printing of artist

		for (int i = 0; i < songs.size(); i++) {
			playlist.add(songs.get(i) + " - " + artist.get(i));
		}

		for (String album : playlist) {
			System.out.println(album);
		}
	}
}
