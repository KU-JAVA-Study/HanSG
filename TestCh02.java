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
		System.out.print("��ȭ�� �Է��ϼ���(���� ��) >> ");
		int won = scanner.nextInt();
		double dollars = won / 1100;
		System.out.println(won + "���� $" + dollars + "�Դϴ�.");
	}
	
	public static void practice02() {
		System.out.print("2�ڸ��� ���� �Է�(10~99) >> ");
		int input = scanner.nextInt();
		int ten = input / 10; // 10�� �ڸ�
		int one = input % 10; // 1�� �ڸ�
		if(ten == one)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
	}
	
	public static void practice03() {
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int money = scanner.nextInt();
		int fiftyThousands = money / 50000;
		int tenThousands = (money % 50000) / 10000;
		int thousands = (money % 10000) / 1000;
		int fiveHundreds = (money % 1000) / 500;
		int hundreds = (money % 500) / 100;
		int fifty = (money % 100) / 50;
		int ten = (money % 50) / 10;
		int one = money % 10;
		
		System.out.println("�������� " + fiftyThousands + "��");
		System.out.println("������ " + tenThousands + "��");
		System.out.println("õ���� " + thousands + "��");
		System.out.println("����� " + fiveHundreds + "��");
		System.out.println("��� " + hundreds + "��");
		System.out.println("���ʿ� " + fifty + "��");
		System.out.println("�ʿ� " + ten + "��");
		System.out.println("�Ͽ� " + one + "��");
		
	}
	
	public static void practice04() {
		System.out.print("���� 3�� �Է� >> ");
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
		
		System.out.println("�߰� ���� " + median);
	}
	
	public static void practice05() {
		System.out.print("���� 3���� �Է��Ͻÿ� >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(a > b && a > c) { // a�� ���� �� ��
			if(b+c > a)
				System.out.println("�ﰢ���� �˴ϴ�.");
			else
				System.out.println("�ﰢ���� �� �� �����ϴ�.");
		}
		if(b > a && b > c) { // b�� ���� �� ��
			if(a+c > b)
				System.out.println("�ﰢ���� �˴ϴ�.");
			else
				System.out.println("�ﰢ���� �� �� �����ϴ�.");
		}
		if(c > a && c > b) { // c�� �� ��
			if(a+b > c)
				System.out.println("�ﰢ���� �˴ϴ�.");
			else
				System.out.println("�ﰢ���� �� �� �����ϴ�.");
		}
		
	}

	public static void practice06() {
		System.out.print("1~99 ������ ������ �Է��Ͻÿ� >> ");
		int input = scanner.nextInt();
		int ten = input / 10; // 10�� �ڸ�
		int one = input % 10; // 1�� �ڸ�
		if((ten % 3 == 0) || (one % 3 == 0)) {
			if((ten % 3 == 0) && (one % 3 == 0))
				System.out.println("�ڼ� ¦¦");
			else
				System.out.println("�ڼ� ¦");
		}
		System.out.println("�н�");
	}
	
	public static void practice07() {
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if(x >= 100 && x <= 200) {
			if(y >= 100 && y <= 200)
				System.out.println("(" + x + ", " + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		}
		else
			System.out.println("(" + x + ", " + y + ")�� �簢�� �ȿ� �����ϴ�.");
	}

	public static void practice08() {
		System.out.print("�� (x1, y1)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("�� (x2, y2)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		if(inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200))
			System.out.println("�浹�մϴ�.");
		else
			System.out.println("�浹���� �ʽ��ϴ�.");
		
	}
	
	// �� (x,y)�� ���簢�� �ȿ� ������ true ��ȯ
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else 
			return false;
	}
	
	public static void practice09() {
		System.out.print("���� �߽ɰ� ������ �Է� >> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		double radius = scanner.nextDouble();
		System.out.print("�� �Է� >> ");
		double xOfPoint = scanner.nextDouble();
		double yOfPoint = scanner.nextDouble();
		double distance = Math.sqrt((x-xOfPoint)*(x-xOfPoint) + (y-yOfPoint)*(y-yOfPoint));
		if(distance <= radius)
			System.out.println("�� (" + xOfPoint + ", " + yOfPoint + ")�� �� �ȿ� �ִ�. ");
		else
			System.out.println("�� (" + xOfPoint + ", " + yOfPoint + ")�� �� �ȿ� ����. ");
		
	}
	
	public static void practice10() {
		System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
		int xOfCircle1 = scanner.nextInt();
		int yOfCircle1 = scanner.nextInt();
		double radius1 = scanner.nextDouble();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է� >> ");
		int xOfCircle2 = scanner.nextInt();
		int yOfCircle2 = scanner.nextInt();
		double radius2 = scanner.nextDouble();
		double distance = Math.sqrt((xOfCircle1 - xOfCircle2)*(xOfCircle1 - xOfCircle2) + (yOfCircle1 - yOfCircle2)*(yOfCircle1 - yOfCircle2));
		if(distance < (radius1 + radius2))
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
	}
	
	public static void practice11() {
		System.out.print("���� �Է��ϼ���(1~12) >> ");
		int month = scanner.nextInt();
		
		//if-else �̿�
//		if(month >= 3 && month <= 5)
//			System.out.println("��");
//		if(month >= 6 && month <= 8)
//			System.out.println("����");
//		if(month >= 9 && month <= 11)
//			System.out.println("����");
//		if(month == 1 || month == 2 || month == 12)
//			System.out.println("�ܿ�");
//		else
//			System.out.println("�߸� �Է�");
		
		//switch �̿�
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�߸� �Է�");
			break;
			
		}
		
	}

	public static void practice12() {
		System.out.print("���� >> ");
		double num1 = scanner.nextDouble();
		String operator = scanner.next();
		double num2 = scanner.nextDouble();
		double result = 0;
		switch(operator) {
		case "+":
			result = num1 + num2;
			System.out.println("��� ����� " + result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println("��� ����� " + result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println("��� ����� " + result);
			break;
		case "/" :
			if(num2 == 0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else {
				result = num1 / num2;
				System.out.println("��� ����� " + result);
			}
			break;
		default:
			System.out.println("�����ڸ� �ٽ� Ȯ�����ּ���");
			break;
		}
		
	}


}
