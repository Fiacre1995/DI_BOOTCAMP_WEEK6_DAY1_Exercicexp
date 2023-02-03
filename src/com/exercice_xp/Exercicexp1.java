package com.exercice_xp;

import java.util.Scanner;

public class Exercicexp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Varscanner = new Scanner(System.in);

		System.out.println("Entrer le premier angle");
		double angle1 = Varscanner.nextDouble();

		System.out.println("Entrer le second angle");
		double angle2 = Varscanner.nextDouble();

		System.out.println("Entrer le troisieme angle");
		double angle3 = Varscanner.nextDouble();

		if ((angle1 + angle2 + angle3) == 180) {

			System.out.println("C'est un triangle Valid");

		} else {

			System.out.println(" C'est un triangle invalid");
		}


	}

}
