package hw2;

public class hw3 {
	public static void main(String[] args) {
	// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int ten =1;
		int i =1;
		while(i<=10) {
			ten=ten*i;
			i++;
			
			
		}
		System.out.println("1~10的連乘積"+ten);
		
	}
}
