package com.Practice;

import java.util.ArrayList;
import java.util.List;

public class Main_Person_Sort {
	


	public static void main(String[] args) {
		
//		Person p = new Person();
		
		Person p1 = new Person("Rakesh", 26,"Jharkhand",5.9,70);
		Person p2 = new Person("Omkar", 25,"Maharastra",5.8,65);
		Person p3 = new Person("Ishan", 24,"Delhi",5.7,73);
		Person p4 = new Person("Addi", 28,"Pune",6.0,75);
		Person p5 = new Person("Abhi", 27,"Bengalore",5.6,60);
		Person p6 = new Person("Abhilash", 20,"Bengalore",5.6,60);
		Person p7 = new Person("Abhinav", 29,"Bengal",5.6,60);
		
		Person [] p = {p1,p2,p3,p4,p5,p6,p7}; 
		bubbleSortPerson(p);
		
		

	}

	private static void bubbleSortPerson(Person[] p) {

			 int l = p.length;
			 Person k;
			
			 for(int i=0;i<l-1;i++){
				 for(int j=i+1;j<l-1;j++){
					 if(p[i].getAge() > p[j].getAge()){
						k = p[i]; 
						p[i] = p[j];
						p[j] = k;
					 }
				 }
			 }
			 
			for(int i=0;i<l-1;i++){
				System.out.print(p[i] + "  ");
				System.out.println();
			}

			 
		}

		
	}




