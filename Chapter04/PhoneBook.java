package Chapter04;

import java.util.Scanner;

public class PhoneBook {
    Scanner scanner = new Scanner(System.in);
    private Phone[] phoneArr;
    private int number; // �ο� ��
    
    public PhoneBook() {
        System.out.print("�ο� �� >> ");
        this.number = scanner.nextInt();
        this.phoneArr = new Phone[this.number];
        for(int i=0;i<phoneArr.length;i++) {
            phoneArr[i] = new Phone();
            System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ ���� �Է�) >> ");
            String name = scanner.next();
            phoneArr[i].setName(name);
            String tel = scanner.next();
            phoneArr[i].setTel(tel);
        }
        System.out.println("����Ǿ����ϴ�");
    }
    
    public void search() {
        while(true) {
            System.out.print("�˻��� �̸� >> ");
            String targetName = scanner.next();
            if(targetName.equals("�׸�")) return;
            int i;
            for (i = 0; i < phoneArr.length; i++)
                if (targetName.equals(phoneArr[i].getName())) {
                    System.out.println(targetName + "�� ��ȣ�� " + phoneArr[i].getTel() + "�Դϴ�.");
                    break;
                }
            if(i == phoneArr.length) System.out.println(targetName + "��(��) �����ϴ�. ");
            
        }  
    }
    
}
