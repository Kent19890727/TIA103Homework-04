package hw2;

public class hw1 {

	public static void main(String[] args) {
		// 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)

		int total = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				total = total + i;
			}
				
		}
		System.out.println("1到1000的偶數和是"+total);//放在迴圈外才能顯示
	}

}