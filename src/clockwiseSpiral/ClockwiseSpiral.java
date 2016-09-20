package clockwiseSpiral;

import java.util.Scanner;

public class ClockwiseSpiral {
	
	public static void main(String args[]) {
		System.out.println("Enter The Value For N :");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[][] spiral = new int[n][n];

		int ertek = 1;

		int minOszlop = 0;

		int maxOszlop = n - 1;

		int minSor = 0;

		int maxSor = n - 1;

		if (n > 1) {
			while (ertek <= n * n) {
				for (int i = minOszlop; i <= maxOszlop; i++) {
					spiral[minSor][i] = ertek;

					ertek++;
				}

				for (int i = minSor + 1; i <= maxSor; i++) {
					spiral[i][maxOszlop] = ertek;

					ertek++;
				}

				for (int i = maxOszlop - 1; i >= minOszlop; i--) {
					spiral[maxSor][i] = ertek;

					ertek++;
				}

				for (int i = maxSor - 1; i >= minSor + 1; i--) {
					spiral[i][minOszlop] = ertek;

					ertek++;
				}

				minOszlop++;

				minSor++;

				maxOszlop--;

				maxSor--;
			}
		} else {
			System.err.println("Pleae n > 1 ...");
		}

		for (int i = 0; i < spiral.length; i++) {
			for (int j = 0; j < spiral.length; j++) {
				System.out.print(spiral[i][j] + "\t");
			}

			System.out.println();
		}
	}
}