package javAssignment;

import java.util.Scanner;

public class AssginMent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("연산>>");
		int first_no = input.nextInt();
		String moji = input.next();
		int second_no = input.nextInt();
		int result = 0;
		int zero_flag = 0;
		
		switch(moji) {
	
			case "+":
				result = first_no + second_no;
				break;
				
			case "-":
				result = first_no + second_no;
				break;
			case "/":
				if (second_no == 0) {
					zero_flag = 1;
					break;
				}
				else {
					result = first_no / second_no;
					break;
				}
			case "*":
				result = first_no * second_no;
				break;
		}
		
		if (zero_flag != 1) {
			System.out.println(first_no+moji+second_no+"의 계산 결과는 "+result);
		}
		else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		

	}

}
