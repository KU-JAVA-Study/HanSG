package Chapter04;

import java.util.Scanner;

public class CircleManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];
        for(int i=0;i<c.length;i++) {
            System.out.print("x, y, radius >> ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        for(int i=0;i<c.length;i++) {
            c[i].show();
        }
        //���� ������ ū �� ã��
        int max_index = 0;
        for(int i=1;i<c.length;i++) {
            if(c[i].getRadius() > c[max_index].getRadius())
                max_index = i;
        }
        System.out.print("���� ū ���� ");
        c[max_index].show();
        scanner.close();
    }

}
