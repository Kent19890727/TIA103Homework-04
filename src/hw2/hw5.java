package hw2;

public class hw5 {

	public static void main(String[] args) {
		//阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。
		//請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		
		for(int lot =1;lot<=49;lot++) {
			if(lot%10==4 || (int)(lot/10)==4) {
				 {
					continue;
				}
					
			}
				System.out.print(lot+" ");
		}
		
	}

}
