package com.sbi.ui;

import java.util.Scanner;

public class FundTransferApp {
	public static void main(String[] args) {
		
		AppUI appUI = new AppUI();
		appUI.showUI();
		
		
	}
}


class AppUI {
	public void showUI() {
		Scanner scan = null;
		while(true) {
			System.out.println("Fund Transfer App");
			System.out.println("=================================");
			System.out.println("1. Account Statement\t2. Transfer Funds");
			System.out.println("3. Quit");
			System.out.println();
			System.out.println();
			System.out.println("=================================");
			System.out.println("Enter your choice: ");
			scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			switch(choice) {
				case 1:
						System.out.println("Display Transaction Screen");
						System.out.println();
						break;
				case 2:
					System.out.println("Display Fund Transfer Screen");
					System.out.println();
					break;
				default:
					break;
			}
			
			if(choice == 3) {
				break;
			}
			
		}
		
		System.out.println("Exiting App");
		
	}
}