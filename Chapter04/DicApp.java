package Chapter04;

import java.util.Scanner;

public class DicApp {
    public static Scanner scanner = new Scanner(System.in);

    public void convertToEng() {
        while (true) {
            System.out.print("한글 단어? ");
            String korWord = scanner.next();
            if (korWord.equals("그만")) break;
            if (Dictionary.kor2Eng(korWord) != null)
                System.out.println(korWord + "은 " + Dictionary.kor2Eng(korWord));
            else
                System.out.println(korWord + "은(는) 사전에 없습니다.");
        }
    }
    
    public void run() {
        System.out.println("한영 단어 검색 프로그램입니다.");
    }
}
