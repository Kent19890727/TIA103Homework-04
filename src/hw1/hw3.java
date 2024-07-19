package hw1;

public class hw3 {

	public static void main(String[] args) {
	int second = 256559;
	int day = 60*60*24;
	System.out.println(second/day+"天");
	System.out.println(second%day/(60*60)+"小時");
	System.out.println((second%day%(60*60))/60+"分鐘");
	System.out.println((second%day%(60*60))%60+"秒");
	
	
	
	
	
	
	
	}

}
