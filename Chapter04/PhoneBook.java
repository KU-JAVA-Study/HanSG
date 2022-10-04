package Chapter04;

import java.util.Scanner;

public class PhoneBook {
    Scanner scanner = new Scanner(System.in);
    private Phone[] phoneArr;
    private int number; // 인원 수
    
    public PhoneBook() {
        System.out.print("인원 수 >> ");
        this.number = scanner.nextInt();
        this.phoneArr = new Phone[this.number];
        for(int i=0;i<phoneArr.length;i++) {
            phoneArr[i] = new Phone();
            System.out.print("이름과 전화번호(이름과 번호는 빈칸 없이 입력) >> ");
            String name = scanner.next();
            phoneArr[i].setName(name);
            String tel = scanner.next();
            phoneArr[i].setTel(tel);
        }
        System.out.println("저장되었습니다");
    }
    
    public void search() {
        while(true) {
            System.out.print("검색할 이름 >> ");
            String targetName = scanner.next();
            if(targetName.equals("그만")) return;
            int i;
            for (i = 0; i < phoneArr.length; i++)
                if (targetName.equals(phoneArr[i].getName())) {
                    System.out.println(targetName + "의 번호는 " + phoneArr[i].getTel() + "입니다.");
                    break;
                }
            if(i == phoneArr.length) System.out.println(targetName + "이(가) 없습니다. ");
            
        }  
    }
    
}
