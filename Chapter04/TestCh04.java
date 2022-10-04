package Chapter04;

import java.util.Scanner;

public class TestCh04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        //실습 #1
//        TV myTV = new TV("LG", 2017, 32);
//        myTV.show();
        
//        //실습 #2
//        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
//        int math = scanner.nextInt();
//        int science = scanner.nextInt();
//        int english = scanner.nextInt();
//        Grade me = new Grade(math, science, english);
//        System.out.println("평균은 " + me.average());
        
//        //실습 #3
//        Song mySong = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
//        mySong.show();
//        
//        Song yourSong = new Song();
//        yourSong.show();
        
//        //실습 #4
//        Rectangle r = new Rectangle(2, 2, 8, 7);
//        Rectangle s = new Rectangle(5, 5, 6, 6);
//        Rectangle t = new Rectangle(1, 1, 10, 10);
//        
//        r.show();
//        System.out.println("s의 면적은  " + s.square());
//        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
//        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
        
//        //실습 #7
//        MonthSchedule april = new MonthSchedule(30);
//        april.run();
        
//        //실습 #8
//        PhoneBook p1 = new PhoneBook();
//        p1.search();
        
//        //실습 #9
//        int[] arr1 = {1, 5, 7, 9};
//        int[] arr2 = {3, 6, -1, 100, 77};
//        int[] arr3 = ArrayUtil.concat(arr1, arr2);
//        ArrayUtil.print(arr3);
//        scanner.close();
        
//        //실습 #10
//        DicApp app = new DicApp();
//        app.run();
//        app.convertToEng();

        
        //실습 #11
        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();
        char op = operator.charAt(0);
        switch(op) {
            case '+':
                Add adder = new Add();
                adder.setValue(a, b);
                System.out.println(adder.calculate());
                break;
            case '-':
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate());
                break;
            case '*':
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate());
                break;
            case '/':
                Div div = new Div();
                div.setValue(a, b);
                if(div.calculate() == -1)
                    System.out.println("0으로 나눌 수 없습니다.");
                else
                    System.out.println(div.calculate());
                break;
                
        }
        
        
        //실습 #12
        
        
        
        
        scanner.close();
    }

}
