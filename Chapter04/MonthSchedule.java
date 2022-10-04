package Chapter04;

import java.util.Scanner;

public class MonthSchedule {
    Scanner scanner = new Scanner(System.in);
    
    private Day[] dayArr;
    private int totalDays;
    
    public MonthSchedule(int days) {
        this.totalDays = days;
        this.dayArr = new Day[days];
        for(int i=0;i<totalDays;i++) {
            dayArr[i] = new Day();
        }
    }
    
    public void input(int day) {
        System.out.print("할일(빈칸 없이 입력)? ");
        String work = scanner.next();
        dayArr[day].set(work);
    }
    
    public void view(int day) {
        System.out.print(day + "일의 할 일은 " + dayArr[day].get() + "입니다.\n");
    }
    
    public void finish() {
        System.out.println("프로그램을 종료 합니다.");
    }
    
    public void run() {
        System.out.println("이번 달 스케쥴 관리 프로그램");
        int menu = 0;
        do {
            System.out.print("할일 (입력:1, 보기:2, 끝내기:3) >> ");
            menu = scanner.nextInt();
            int day = 0;
            if(menu == 1 || menu == 2) {
                System.out.print("날짜(1~30)? ");
                day = scanner.nextInt();
            }
            switch(menu) {
                case 1:
                    input(day);
                    break;
                case 2:
                    view(day);
                    break;
                case 3:
                    finish();
                    break;
                default:
                    System.out.println("번호흘 잘못 입력하셨습니다.");
                    break;
            }
        } while(menu!=3);
        
    }
}
