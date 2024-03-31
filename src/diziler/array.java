package diziler;
import java.util.Random;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Matris boyutunu giriniz:");
		int matrisBoyut = scanner.nextInt();
		
		int[][] matris = new int[matrisBoyut][matrisBoyut];
		
		for(int i = 0; i < matrisBoyut; i++) {
			for(int j = 0; j < matrisBoyut; j++) {
				matris[i][j] = rand.nextInt(100);
			}
		}
		
		System.out.println("Sıralanmamış matris:");
		for(int i = 0; i < matrisBoyut; i++) {
			for(int j = 0; j < matrisBoyut; j++) {
				System.out.print(matris[i][j]+ "\t");
			}
			System.out.println();
		}
		
		for(int i = 0; i < matrisBoyut; i ++) {
			for(int j = 0; j < matrisBoyut - 1; j++) {
				for(int k = 0; k < matrisBoyut - j - 1; k++) {
					
					
					if(matris[i][k] > matris[i][k+1]) {
						int araDegisken = matris[i][k];
						matris[i][k] = matris[i][k+1];
						matris[i][k+1] = araDegisken;	
						
					}
				}
			}
		}
		
		System.out.println("Küçükten büyüğe sıralanmış matris:");
		for(int i = 0; i < matrisBoyut; i++) {
			for(int j = 0; j < matrisBoyut; j++) {
				System.out.print(matris[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}