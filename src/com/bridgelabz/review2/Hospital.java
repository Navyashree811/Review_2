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
				addPatient.addPatientDetails();
				break;
			case 2:
				addPatient.editPatientDetails();
				break;
			case 3:
				addPatient.showPatientDetails();
				break;
			default:
				i = 1;
				System.out.println("Wrong option");
				addPatient.addPatientDetails();
				break;
			}

		}

	}

	public void addPatientDetails() {

		Patient patients = new Patient();// Object of PatientDetails
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name of person:");
		patients.setName(sc.next());

		System.out.println("Enter the Address Name of person:");
		patients.setDepartment(sc.next());
		System.out.println("Enter the City Name of person:");
		patients.setCity(sc.next());
		System.out.println("Enter the State Name of person:");
		patients.setState(sc.next());

		System.out.println("Enter the Age of person:");
		patients.setAge(sc.nextInt());
		System.out.println("Enter the Phone number of person:");
		patients.setPhoneNumber(sc.nextInt());

		// to add multiple contact in the array list
		patientDetails.add(patients);
		System.out.println("******************************************");
		System.out.println(patients.toString());
	}
	public void editPatientDetails() {

		System.out.println("Confirm your first name to edit details: ");
		String name = sc.next();

		for (int i = 0; i < patientDetails.size(); i++) {
			if (patientDetails.get(i).getName().equals(name)) {
				System.out.println("Select form below to change: ");
				System.out.println(
						"\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
				int edit = sc.nextInt();

				switch (edit) {
				case 1:
					System.out.println("Enter first name");
					patientDetails.get(i).setName(sc.next());
					break;
				case 2:
					System.out.println("Enter city");
					patientDetails.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter state");
					patientDetails.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter email");
					patientDetails.get(i).setDepartment(sc.next());
					break;
				case 8:
					System.out.println("Enter phone number");
					patientDetails.get(i).setPhoneNumber(sc.nextInt());
					break;
				}

				System.out.println(patientDetails);

			} else
				System.out.println("Enter valid First name");
		}

	}

	// show address book methods
		public void showPatientDetails() {
			for (Patient c : patientDetails) {
				System.out.println(c);
			}
		}

}
