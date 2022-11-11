public class Harshad {
	
	public static void main(String args[]) {

		System.out.println(isHarshad(75));
		System.out.println(isHarshad(171));
		System.out.println(isHarshad(481));
		System.out.println(isHarshad(89));
		System.out.println(isHarshad(516));
		System.out.println(isHarshad(200));
	}
	
	public static boolean isHarshad(int num) {
		int sum = 0;
		sum = sum(num, sum);
		
		if((num % sum) == 0) {
        	return true;
        }
		return false;
	}
	
	public static int sum(int num, int sum) {
		int rem;
		if(num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			return sum(num, sum);	
		}
		return sum;		
	}
	
}