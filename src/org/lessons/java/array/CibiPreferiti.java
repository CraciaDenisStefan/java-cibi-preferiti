package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] classificaCibi = {"Pizza", "Sushi", "Pasta", "Gelato", "Burger", "Pollo"};
		
		System.out.println("Lunghezza della classifica: " + classificaCibi.length);
		System.out.println("Il cibo top è: " + classificaCibi[0]);
		System.out.println("Il cibo preferito ma non troppo è: " + classificaCibi[classificaCibi.length - 1]);
		
		int posizioneMediana = classificaCibi.length / 2;
		System.out.println("Il cibo di mezza classifica è: " + classificaCibi[posizioneMediana]);
	}

}
