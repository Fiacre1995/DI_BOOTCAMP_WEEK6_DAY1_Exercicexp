package com.exercice_xp;

import java.util.HashMap;
import java.util.Map;

public class Scrable {
	
	private static Map<String, Integer> letterscrable = new HashMap<>();
	
	public Scrable() {
		
		letterscrable.put("A", 1);
		letterscrable.put("E", 1);
		letterscrable.put("I", 1);
		letterscrable.put("O", 1);
		letterscrable.put("U", 1);
		letterscrable.put("L", 1);
		letterscrable.put("N", 1);
		letterscrable.put("R", 1);
		letterscrable.put("S", 1);
		letterscrable.put("T", 1);
		letterscrable.put("D", 2);
		letterscrable.put("G", 2);
		letterscrable.put("B", 3);
		letterscrable.put("C", 3);
		letterscrable.put("M", 3);
		letterscrable.put("P", 3);
		letterscrable.put("F", 4);
		letterscrable.put("H", 4);
		letterscrable.put("V", 4);
		letterscrable.put("W", 4);
		letterscrable.put("Y", 4);
		letterscrable.put("K", 5);
		letterscrable.put("J", 8);
		letterscrable.put("X", 8);
		letterscrable.put("Q", 10);
		letterscrable.put("Z", 10);
				
	}

	
	public static int getScore (String word) {
		int Score = 0;
		for (int i=0; i< word.length(); i++) {
			String key = (word.charAt(i) + "").toUpperCase();
			if(letterscrable.containsKey(key)) {
				Score += letterscrable.get(key);
			}
		}
		return Score;
	}
	
	public static void main(String[] args) {
		
			
		int Resultat = new Scrable().getScore("Fanta");
		System.out.print(Resultat);
			
			
		}

}
