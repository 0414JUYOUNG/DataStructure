package Week1;

public class FactRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = factorial(5);
		System.out.println(result);
		
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if(n==1) {
			result = 1;
		}else {
			result = n * factorial(n-1);
			
		}
		
		return result;
	}

}
