package day10;

public class Array1 {

	public static void main(String[] args) {
		double[] arrd= new double[5];
		arrd[0] = 3.12;
		arrd[1] = 1.23;
		arrd[2] = 4.12;
		String[] grade= {"kor","math","java"};
		char c[] = {'n', 'h'};
		// 정수 배열을 선언하시오.
		int arr[] = {1,2,3,2,3,4,5};
		int i;
        for(i=0; i<arr.length; i++ ) {
        	System.out.print(arr[i]+" ");
        }	
        // 배열의 세번째요소의 값을 5로 변경하시오.
        arr[2] =5;
        System.out.println(" ");
        for(i=0; i<arr.length; i++ ) {
            System.out.print(arr[i]+" ");
        }
            //역순으로 출력하시오.
        System.out.println("");
        for( i=arr.length-1; i>=0; i-- ) {
        	System.out.print(arr[i]+" ");
        }
	}

}
