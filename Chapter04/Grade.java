package Chapter04;

public class Grade {
    private int math;
    private int english;
    private int science;
    private double average;
    
    public Grade(int math, int english, int science) {
        this.math = math;
        this.english = english;
        this.science = science;
        this.average = 0;
    }
    
    public double average() {
        average = (this.math + this.english + this.science) / 3;
        return average;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }
    
}
