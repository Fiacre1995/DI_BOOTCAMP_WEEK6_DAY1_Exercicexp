package com.exercice_xp;

import java.util.Scanner;

public class Exercicexp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner Varscanner = new Scanner(System.in)) {
			System.out.println("Veuillez entrez le décallage Horraire (Entrez une valeur négative si la destination est en retard");
			int DecalageHorraire = Varscanner.nextInt();
			
			int HeureDestinationNuit = DecalageHorraire < 0 ? 24 + DecalageHorraire : DecalageHorraire;
			int HeureDestinationJour = 12 + DecalageHorraire;
			
			System.out.println("L'heure de la destination  Nuit est :" + HeureDestinationNuit + " Heure");
			System.out.println("L'heure de la destination  journee est :" + HeureDestinationJour + " Heure");
		} catch (Exception e) {
			
			System.err.println(e.getLocalizedMessage());
		}
		

	}

}
