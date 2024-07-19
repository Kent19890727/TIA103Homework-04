package hw2;

public class hw8_3 {
	public static void main(String[] args) {
		// 使用while迴圈+ do while迴圈
		int i = 0;
		while (i < 9) {
			i++;
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
	}
} 