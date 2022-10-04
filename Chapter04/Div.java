package Chapter04;

public class Div {
    private int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        if(b != 0)
            return (this.a / this.b);
        else 
            return -1;
    }
}
