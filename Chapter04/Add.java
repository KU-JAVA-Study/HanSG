package Chapter04;

public class Add {
    private int a, b;
    
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int calculate() {
        int result = this.a + this.b;
        return result;
    }
    
}
