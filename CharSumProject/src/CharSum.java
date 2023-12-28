import java.util.Scanner;

public class CharSum {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        int N = sc.nextInt(); //입력을 받고
		        String sNum = sc.next();
		        char[] cNum = sNum.toCharArray(); //숫자를 문자열로 바꿔준다. 왜냐면 int 나 long은 문제의 조건이었던 범위 1<N<100 자리수일때 사용할 수 없다.
		        int sum = 0;
		        for (int i = 0; i < cNum.length; i++) { //문자열의 인덱스 자릿수만큼을 반복한다.
		            sum += cNum[i] - '0';
		            //각 자릿수의 문자열에 아스키코드 차이 만큼 빼고 이를 반복하여 더한다.
		            //아스키 코드 문자열과 숫자의 차이는 48또는 '0'이므로 이를 빼준다
		        }
		        System.out.println(sum);
		        System.out.println(sum); //추가 내용 

		    

	}

}