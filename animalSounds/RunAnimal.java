package animalSounds;

import java.util.Scanner;

public class RunAnimal{

	public static void main(String[] args) throws InterruptedException {
		Scanner scn = new Scanner (System.in);
		Bird bird = new Bird();
		Cat cat = new Cat();
		Dog dog = new Dog();
		while(true) {
		System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
		String animal = scn.next();
		
		if (animal.equalsIgnoreCase("B")) {
			Thread.sleep(1000); bird.eat();
			bird.sleep();
			bird.makeSound();
			System.out.println(" ");
		} else if (animal.equalsIgnoreCase("C")) {
			Thread.sleep(1000);cat.eat();
			cat.sleep();
			cat.makeSound();
			System.out.println(" ");
		} else if (animal.equalsIgnoreCase("D")) {
			Thread.sleep(1000);dog.eat();
			dog.sleep();
			dog.makeSound();
			System.out.println(" ");
		} else {
			System.out.println(" ");
			System.out.println("Thank you!");
			System.exit(0);
		}
		}
		
	}



}
