package Chapter02;

import java.util.Scanner;

public class TestCh02 {

	public static void main(String[] args) {
//		practice01();
//		practice02();
//		practice03();
//		practice04();
//		practice05();
//		practice06();
//		practice07();
		practice08();
//		practice09();
//		practice10();
//		practice11();
//		practice12();
		
	}

	public static Scanner scanner = new Scanner(System.in);
	
	public static void practice01() {
		System.out.print("원화를 입력하세요(단위 원) >> ");
		int won = scanner.nextInt();
		double dollars = won / 1100;
		System.out.println(won + "원은 $" + dollars + "입니다.");
	}
	
	public static void practice02() {
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int input = scanner.nextInt();
		int ten = input / 10; // 10의 자리
		int one = input % 10; // 1의 자리
		if(ten == one)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
	}
	
	public static void practice03() {
		System.out.print("금액을 입력하시오 >> ");
		int money = scanner.nextInt();
		int fiftyThousands = money / 50000;
		int tenThousands = (money % 50000) / 10000;
		int thousands = (money % 10000) / 1000;
		int fiveHundreds = (money % 1000) / 500;
		int hundreds = (money % 500) / 100;
		int fifty = (money % 100) / 50;
		int ten = (money % 50) / 10;
		int one = money % 10;
		
		System.out.println("오만원권 " + fiftyThousands + "매");
		System.out.println("만원권 " + tenThousands + "매");
		System.out.println("천원권 " + thousands + "매");
		System.out.println("오백원 " + fiveHundreds + "개");
		System.out.println("백원 " + hundreds + "개");
		System.out.println("오십원 " + fifty + "개");
		System.out.println("십원 " + ten + "개");
		System.out.println("일원 " + one + "개");
		
	}
	
	public static void practice04() {
		System.out.print("정수 3개 입력 >> ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int median = 0;

		if(num1 > num2 && num1 > num3) {
			if(num2 > num3)
				median = num2;
			else
				median = num3;
		}
		if(num2 > num1 && num2 > num3) {
			if(num1 > num3)
				median = num1;
			else
				median = num3;
		}
		if(num3 > num1 && num3 > num2) {
			if(num2 > num1)
				median = num2;
			else
				median = num1;
		}
		
		System.out.println("중간 값은 " + median);
	}
	
	public static void practice05() {
		System.out.print("정수 3개를 입력하시오 >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(a > b && a > c) { // a가 가장 긴 변
			if(b+c > a)
				System.out.println("삼각형이 됩니다.");
			else
				System.out.println("삼각형이 될 수 없습니다.");
		}
		if(b > a && b > c) { // b가 가장 긴 변
			if(a+c > b)
				System.out.println("삼각형이 됩니다.");
			else
				System.out.println("삼각형이 될 수 없습니다.");
		}
		if(c > a && c > b) { // c가 긴 변
			if(a+b > c)
				System.out.println("삼각형이 됩니다.");
			else
				System.out.println("삼각형이 될 수 없습니다.");
		}
		
	}

	public static void practice06() {
		System.out.print("1~99 사이이 정수를 입력하시오 >> ");
		int input = scanner.nextInt();
		int ten = input / 10; // 10의 자리
		int one = input % 10; // 1의 자리
		if((ten % 3 == 0) || (one % 3 == 0)) {
			if((ten % 3 == 0) && (one % 3 == 0))
				System.out.println("박수 짝짝");
			else
				System.out.println("박수 짝");
		}
		System.out.println("패스");
	}
	
	public static void practice07() {
		System.out.print("점 (x,y)의 좌표를 입력하시오 >> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if(x >= 100 && x <= 200) {
			if(y >= 100 && y <= 200)
				System.out.println("(" + x + ", " + y + ")는 사각형 안에 있습니다.");
		}
		else
			System.out.println("(" + x + ", " + y + ")는 사각형 안에 없습니다.");
	}

	public static void practice08() {
		System.out.print("점 (x1, y1)의 좌표를 입력하시오 >> ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("점 (x2, y2)의 좌표를 입력하시오 >> ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		if(inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200))
			System.out.println("충돌합니다.");
		else
			System.out.println("충돌하지 않습니다.");
		
	}
	
	// 점 (x,y)가 직사각형 안에 있으면 true 반환
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else 
			return false;
	}
	
	public static void practice09() {
		System.out.print("원의 중심과 반지름 입력 >> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		double radius = scanner.nextDouble();
		System.out.print("점 입력 >> ");
		double xOfPoint = scanner.nextDouble();
		double yOfPoint = scanner.nextDouble();
		double distance = Math.sqrt((x-xOfPoint)*(x-xOfPoint) + (y-yOfPoint)*(y-yOfPoint));
		if(distance <= radius)
			System.out.println("점 (" + xOfPoint + ", " + yOfPoint + ")는 원 안에 있다. ");
		else
			System.out.println("점 (" + xOfPoint + ", " + yOfPoint + ")는 원 안에 없다. ");
		
	}
	
	public static void practice10() {
		System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
		int xOfCircle1 = scanner.nextInt();
		int yOfCircle1 = scanner.nextInt();
		double radius1 = scanner.nextDouble();
		System.out.print("두번째 원의 중심과 반지름 입력 >> ");
		int xOfCircle2 = scanner.nextInt();
		int yOfCircle2 = scanner.nextInt();
		double radius2 = scanner.nextDouble();
		double distance = Math.sqrt((xOfCircle1 - xOfCircle2)*(xOfCircle1 - xOfCircle2) + (yOfCircle1 - yOfCircle2)*(yOfCircle1 - yOfCircle2));
		if(distance < (radius1 + radius2))
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
	}
	
	public static void practice11() {
		System.out.print("달을 입력하세요(1~12) >> ");
		int month = scanner.nextInt();
		
		//if-else 이용
//		if(month >= 3 && month <= 5)
//			System.out.println("봄");
//		if(month >= 6 && month <= 8)
//			System.out.println("여름");
//		if(month >= 9 && month <= 11)
//			System.out.println("가을");
//		if(month == 1 || month == 2 || month == 12)
//			System.out.println("겨울");
//		else
//			System.out.println("잘못 입력");
		
		//switch 이용
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력");
			break;
			
		}
		
	}

	public static void practice12() {
		System.out.print("연산 >> ");
		double num1 = scanner.nextDouble();
		String operator = scanner.next();
		double num2 = scanner.nextDouble();
		double result = 0;
		switch(operator) {
		case "+":
			result = num1 + num2;
			System.out.println("계산 결과는 " + result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println("계산 결과는 " + result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println("계산 결과는 " + result);
			break;
		case "/" :
			if(num2 == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else {
				result = num1 / num2;
				System.out.println("계산 결과는 " + result);
			}
			break;
		default:
			System.out.println("연산자를 다시 확인해주세요");
			break;
		}
		
	}


}
