package hw2;

public class hw7 {

	public static void main(String[] args) {
		//請設計一隻Java程式，輸出結果為A-F每行遞增
		char[] letters = {'A','B','C','D','E','F'};
		
		for (int i=0;i<letters.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(letters[i]);
			}
			System.out.println();
		}
		
		
		
		
		}

	}


