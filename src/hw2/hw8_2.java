package hw2;

public class hw8_2 {

	public static void main(String[] args) {
		//使用for迴圈+ do while迴圈
		
		for (int i = 1; i <= 9; i++) {
			int j =1;
			do {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				j++;
			}while(j<=9);
			System.out.println();
		}
		
	}

}
