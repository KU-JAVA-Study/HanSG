package Chapter04;

public class TV {
    private String company;
    private int year;
    private int size;

    public TV(String company, int year, int size) {
        this.company = company;
        this.year = year;
        this.size = size;
    }
    
    public void show() {
        System.out.println(company + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
