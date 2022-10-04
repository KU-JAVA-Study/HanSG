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
        System.out.print("����(��ĭ ���� �Է�)? ");
        String work = scanner.next();
        dayArr[day].set(work);
    }
    
    public void view(int day) {
        System.out.print(day + "���� �� ���� " + dayArr[day].get() + "�Դϴ�.\n");
    }
    
    public void finish() {
        System.out.println("���α׷��� ���� �մϴ�.");
    }
    
    public void run() {
        System.out.println("�̹� �� ������ ���� ���α׷�");
        int menu = 0;
        do {
            System.out.print("���� (�Է�:1, ����:2, ������:3) >> ");
            menu = scanner.nextInt();
            int day = 0;
            if(menu == 1 || menu == 2) {
                System.out.print("��¥(1~30)? ");
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
                    System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
                    break;
            }
        } while(menu!=3);
        
    }
}
