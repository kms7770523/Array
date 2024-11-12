package day10;

public class Sunjunk {

	public static void main(String[] args) {
		    String[] names = {"tom","ann","jhon"};
		    int[] kor = {50,30,90};
		    int[] math = {33,44,55};
		    int i =0;
		    System.out.print("name : ");
		    for( i=0; i<names.length; i++)
		         System.out.print(names[i]+" ");
		    
		    System.out.println("");
		    System.out.print("kor  :");
		    for( i=0; i<kor.length; i++)
		         System.out.printf("%3d  ",kor[i]);
		    
		    System.out.println("");
		    System.out.print("math  :");
		    for( i=0; i<math.length; i++)
		         System.out.printf("%3d  ",math[i]);
		    
		    //사람별 총합을 구하여 출력하시오.
		    System.out.println("");
		    System.out.print("total  :");
		    for( i=0; i<3; i++) {
		    int total = kor[i] + math[i];
		    	//계산식
		    System.out.printf("%3d  ", total);
	}//main
	}
}//class
