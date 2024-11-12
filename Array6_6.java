package day10;

public class Array6_6 {

	public static void main(String[] args) {
		int[] evens = {2,4,6,8,10};
		int primes[] = {1,3,5,7,9,11,13};
		int evenSum =sum(evens);//파라미터를 인수/ 실제값
		System.out.println("짝수의 합(evens배열값):"+ evenSum);
        
		int primesSum = sum(primes);
		System.out.println("소수의 합(primes배열값):"+primesSum);
	}//main
	
    public static int sum(int arr[] ) {
    	int total =0;
    	for (int i=0;i< arr.length; i++) {
    	     total+= arr[i];
    	}
    	return total;
    }
}
