package hw2;

public class hw8_1 {

	public static void main(String[] args) {
		//使用for迴圈+ while迴圈
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				j++;
				
			}
			System.out.println();
		}

	}

}
