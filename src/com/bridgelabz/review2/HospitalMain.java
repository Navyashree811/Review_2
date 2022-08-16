/*
 * Group-2 -> Create multiple Hospitals 
 * -> Create Patients with details(name, age, phoneNumber,city,state, department)
 *  -> Create an Enum for Department(Values-> ONCOLOGY, NEUROLOGY , CARDIOLOGY , GYNOCOLOGY)
 * -> Add multiple Patients in each Hospital -> Also Maintain a MAP of Hospitals through a 
 * Map(key->HospitalName , value-> Hospital-Object)  ->  Create 3 classes - Hospital , Patient and HospitalMain
 */
package com.bridgelabz.review2;

import java.util.HashMap;
import java.util.Map;

public class HospitalMain {
	public static void main(String[] args) {

		Hospital h1 = new Hospital("Apolo");
		Hospital h2 = new Hospital("Medanta");
		Hospital h3 = new Hospital("City Hospital");
		Hospital h4 = new Hospital("SGT");
		

		Patient p1 = new Patient("Tom", "19", "9876543210", "Udaipur", "Rajsthan", Department.CARDIOLOGY);
		Patient p2 = new Patient("Hary", "29", "9876543210", "Udaipur", "Rajsthan", Department.GYNOCOLOGY);
		Patient p3 = new Patient("Adam", "39", "9876543210", "Udaipur", "Rajsthan", Department.NEUROLOGY);
		Patient p4 = new Patient("Joy",  "49", "9876543210", "Udaipur", "Rajsthan", Department.ONCOLOGY);

		Map<Object, Object> hm = new HashMap<Object, Object>();

		hm.put(h1, p1);
		hm.put(h2, p2);
		hm.put(h1, p3);
		hm.put(h2, p4);

		for (Map.Entry<Object, Object> e : hm.entrySet())

			System.out.println(e.getKey() + " " + e.getValue());
	}

}
