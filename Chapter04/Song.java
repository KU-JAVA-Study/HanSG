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
        System.out.print("노래 제목을 입력하세요 : ");
        String title = scanner.nextLine();
        setTitle(title);
        System.out.print("가수를 입력하세요 : ");
        String artist = scanner.nextLine();
        setArtist(artist);
        System.out.print("발표 연도를 입력하세요 : ");
        int year = scanner.nextInt();
        setYear(year);
        System.out.print("국적을 입력하세요 : ");
        scanner.nextLine();
        String country = scanner.nextLine();
        setCountry(country);
    }
    
    public void show() {
        System.out.println(this.year + "년 " + this.country + 
                " 국적의 " + this.artist + "가 부른 " + this.title);   
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
