package com.bridgelabz.review2;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {  
	ArrayList<Patient> patientDetails = new ArrayList(); 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int i = 0;
		
		Hospital addPatient = new Hospital();
		
		while (i == 0) {
			System.out.println("Do you would like to continue ? : ");
			System.out.println("1.Add details.\n2.Edit details. \n3.Show Patient Details. \n4.Delete the details");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				addPatient.addContactDetails();
				break;
			case 2:
				addPatient.editContactDetails();
				break;
			case 3:
				addPatient.showAddressBook();
				break;
			case 4:
				addPatient.addContactDetails();
				break;
			default:
				i = 1;
				System.out.println("Wrong option");
				addPatient.addContactDetails();
				break;
			}
		
		}
	
	}

	private void editContactDetails() {
		// TODO Auto-generated method stub
		
	}

	private void showAddressBook() {
		// TODO Auto-generated method stub
		
	}

	private void addContactDetails() {
		// TODO Auto-generated method stub
		
	}  
}
