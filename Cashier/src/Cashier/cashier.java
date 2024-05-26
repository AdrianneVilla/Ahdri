package Cashier;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class cashier {

	public static void main(String[]args) {
		Stack<String> cashier1 = new Stack<>();
		Stack<String> cashier2 = new Stack<>();
		Stack<String> cashier3 = new Stack<>();
		Stack<String> cashier4 = new Stack<>();
		Stack<String> cashier5 = new Stack<>();
		Queue<String> customers = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 20; i++) {
			System.out.print("Enter customer: ");
			int customerNum = input.nextInt();
			
			customers.offer("Customer " + customerNum);
			
			if(cashier1.size() < 4) {
				cashier1.push(customers.poll());
			}else if(cashier2.size() < 4) {
				cashier2.push(customers.poll());
			}else if(cashier3.size() < 4) {
				cashier3.push(customers.poll());
			}else if(cashier4.size() < 4) {
				cashier4.push(customers.poll());
			}else if(cashier5.size() < 4) {
				cashier5.push(customers.poll());
			}
			
			System.out.println("Cashier 1 : " + cashier1);
			System.out.println("Cashier 2 : " + cashier2);
			System.out.println("Cashier 3 : " + cashier3);
			System.out.println("Cashier 4 : " + cashier4);
			System.out.println("Cashier 5 : " + cashier5);
		}
		
		for(int i = 0; i < 5; i++) {
			if(cashier1.size() == 4) {
				for(int j = 0; j < 4; j++) {
					cashier1.pop();
				}
			}else if(cashier2.size() == 4) {
				for(int j = 0; j < 4; j++) {
					cashier2.pop();
				}
			}else if(cashier3.size() == 4) {
				for(int j = 0; j < 4; j++) {
					cashier3.pop();
				}
			}else if(cashier4.size() == 4) {
				for(int j = 0; j < 4; j++) {
					cashier4.pop();
				}
			}else if(cashier5.size() == 4) {
				for(int j = 0; j < 4; j++) {
					cashier5.pop();
				}
			}
		}
			
		System.out.println("\nCashier 1 : " + cashier1);
		System.out.println("Cashier 2 : " + cashier2);
		System.out.println("Cashier 3 : " + cashier3);
		System.out.println("Cashier 4 : " + cashier4);
		System.out.println("Cashier 5 : " + cashier5);
	}
}
