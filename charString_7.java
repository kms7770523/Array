package day10;

public class charString_7 {

	public static void main(String[] args) {
        String str ="programming is fun! Right";
        System.out.println("str="+str);
        char[] charArr = str.toCharArray();
        for(int i = 0; i<str.length(); i++) {
        	System.out.print(charArr[i]+" ");
        }
         //배열의 값중 r or R몇번 나왔는지 출력하시오.
        int count=0;
        for(int i = 0; i<str.length(); i++) {
        	if(charArr[i] =='r' || charArr[i] =='R')
        		//count=count+1;
        		//count+=i;
        		count++;
        }
        System.out.println("");
        System.out.println("r이나온 횟수:"+count);
	}

}
