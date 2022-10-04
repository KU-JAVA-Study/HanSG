package Chapter04;

import java.util.Scanner;

public class Song {
    public static Scanner scanner = new Scanner(System.in);
    
    private String title;
    private String artist;
    private int year;
    private String country;
    
    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public Song() {
        System.out.print("�뷡 ������ �Է��ϼ��� : ");
        String title = scanner.nextLine();
        setTitle(title);
        System.out.print("������ �Է��ϼ��� : ");
        String artist = scanner.nextLine();
        setArtist(artist);
        System.out.print("��ǥ ������ �Է��ϼ��� : ");
        int year = scanner.nextInt();
        setYear(year);
        System.out.print("������ �Է��ϼ��� : ");
        scanner.nextLine();
        String country = scanner.nextLine();
        setCountry(country);
    }
    
    public void show() {
        System.out.println(this.year + "�� " + this.country + 
                " ������ " + this.artist + "�� �θ� " + this.title);   
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

   
}
