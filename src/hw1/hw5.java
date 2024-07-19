package hw1;

public class hw5 {
	public static void main(String[] args) {
//	某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
//	請用程式計算10年後，本金加利息共有多少錢 (用複利計算)
//	複利公式為:本錢x（1+年化報酬率） 投資幾年
		
		double money =1500000;
		
		money = money*Math.pow((1+0.02),10);
		
		System.out.println("本金+利息"+money);
		
		
		
		
		
	}
	
	
}
