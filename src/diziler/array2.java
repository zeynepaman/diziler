package diziler;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class array2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int boyut = random.nextInt(6)+1;
		System.out.println("Dizi boyutu: " + boyut);
		
		
		int[] dizi1 = new int[boyut];
		int[] dizi2 = new int[boyut];
		int[] carpim = new int[boyut];
		int[] toplam = new int[boyut];
		
		
		for(int i = 0; i < boyut; i++) {
			System.out.println("Dizi1 için yeni elemanı eklemek için bir tuşa basın");
			scanner.nextLine();
			dizi1[i] = random.nextInt(101);
			System.out.println("Dizi 1: " + Arrays.toString(Arrays.copyOfRange(dizi1, 0, i + 1)));
		}
		
		for(int i = 0; i < boyut; i++) {
			System.out.print("Dizi2 için yeni elemanı eklemek için bir tuşa basın.");
			scanner.nextLine();
			dizi2[i] = random.nextInt(101);
			System.out.println("Dizi 2: " + Arrays.toString(Arrays.copyOfRange(dizi2, 0, i + 1)));
			
			carpim[i] = dizi1[i] * dizi2[i];
			
			toplam[i] = dizi1[i] + dizi2[i];
		}
		
		
		System.out.println("Son haller:");
		System.out.println("Dizi 1: " + Arrays.toString(dizi1));
		System.out.println("Dizi 2: " + Arrays.toString(dizi2));
		System.out.println("Çarpım Dizi: " + Arrays.toString(carpim));
		System.out.println("Toplam Dizi: " + Arrays.toString(toplam));
		
		Arrays.sort(dizi1);
		Arrays.sort(dizi2);
		System.out.println("Sıralı Dizi 1: " + Arrays.toString(dizi1));
		System.out.println("Sıralı Dizi 2: " + Arrays.toString(dizi2));
		
		}

	}


