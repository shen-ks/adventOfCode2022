import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class TuningTrouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int counter = sc.nextInt();
		//method to find the index of the first fourteen non-repeating character in a string recursively
		int index = findIndex(line, counter);
		System.out.println(index );
		
	}
	
	private static int findIndex(@NotNull String line, int n) { //n is the number of non-repeating characters
		int index = -1;
		boolean match = false;
		int counter = n;
		
		for (int i = 0; i < line.length(); i++) {
			for (int j = 1; j < n; j++) {
				if (line.charAt(i) != line.charAt(i + j)) {
					match = true;
					
				} else {
					match = false;
					break;
				}
				
				
			}
			if (match) {
				
				if (n == 0) {
					index = i;
					break;
				}
				n--;
				
			} else {
				n = counter;
				
			}
		}
		
		return index;
	}
}
