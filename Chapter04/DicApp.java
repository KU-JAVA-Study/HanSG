package Chapter04;

import java.util.Scanner;

public class DicApp {
    public static Scanner scanner = new Scanner(System.in);

    public void convertToEng() {
        while (true) {
            System.out.print("�ѱ� �ܾ�? ");
            String korWord = scanner.next();
            if (korWord.equals("�׸�")) break;
            if (Dictionary.kor2Eng(korWord) != null)
                System.out.println(korWord + "�� " + Dictionary.kor2Eng(korWord));
            else
                System.out.println(korWord + "��(��) ������ �����ϴ�.");
        }
    }
    
    public void run() {
        System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
    }
}
