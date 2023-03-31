package weekone.daytwo;

public class FibonacciSeries {

	public static void main(String[] args) {
int range = 8;
int firstNum = 0;
int secNum =1;
System.out.println(firstNum);
for (int i = 0; i <= range; i++) {
	
	int sum = firstNum + secNum;
	firstNum = secNum;
	secNum= sum;
	
	System.out.println(firstNum);
}
	}

}
