package Chapter03;

import java.util.Random;
import java.util.Scanner;

public class TestCh03 {

    public static void main(String[] args) {
        //question02();
        //question03();
        //question04();
        //question05();
        //question06();
        //question07();
        //question08();
        //question09();
        question10();
    }

    public static Scanner scanner = new Scanner(System.in);
    
    public static void question02() {
        int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
        for(int num[] : n) {
            for(int i : num)
                System.out.print(i + " ");
            System.out.println();
        }
    }
    
    public static void question03() {
        System.out.print("정수를 입력하시오 >> ");
        int num = scanner.nextInt();
        for(int i=0;i<num;i++) {
            for(int j=0;j<5-i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
    public static void question04() {
        System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
        String input = scanner.next();
        char c = input.charAt(0);
        for(int i=0;i<=c-'a';i++) {
            for(char j='a';j<=c-i;j++)
                System.out.print(j);
            System.out.println();
        }
    }

    public static void question05() {
        int[] arr = new int[10];
        System.out.print("양의 정수 10개를 입력하시오 >> ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = scanner.nextInt();
        }
//        ???
//        for(int i : arr)
//            i = scanner.nextInt();
        System.out.print("3의 배수는 ");
        for(int i=0;i<arr.length;i++) {
            if(arr[i] % 3 == 0)
                System.out.print(arr[i] + " ");
        }
    }
    
    public static void question06() {
        System.out.print("금액을 입력하시오 >> ");
        int money = scanner.nextInt();
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        for(int i=0;i<unit.length;i++) {
            System.out.println(unit[i] + "원 짜리 : " + (money / unit[i] + "개"));
            money = money % unit[i];
        }
    }
    
    public static void question07() {
        System.out.print("랜덤한 정수들 >> ");
        int[] arr = new int[10];
        double sum = 0;
        for(int i : arr) {
            i = (int)(Math.random()*10 + 1);
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\n평균은 " + (sum / 10));
    }
    

    public static void question08() {
        Random r = new Random();
        System.out.print("정수 몇 개? ");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++) {
            arr[i] = r.nextInt(100) + 1;
            for(int j=0;j<i;j++)
                if(arr[j] == arr[i]) {
                    i--;
                    break;
                }
        }
        for(int i=0;i<arr.length;i++) {
            if(i % 10 == 0)
                System.out.println();
            System.out.print(arr[i] + " ");
        }
           
    }

    public static void question09() {
        Random r = new Random();
        int[][] arr = new int[4][4];
        for(int[] n:arr) {
            for(int i:n) {
                i = r.nextInt(10) + 1;
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    public static void question10() {
       //???
    }

}
