package Chapter04;

public class Rectangle {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        super();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public int square() {
        int squareArea = this.width * this.height;
        return squareArea;
    }
    
    public void show() {
        System.out.printf("(%d, %d)에서 크기가 %d*%d인 사각형\n", x, y, width, height);
    }
    
    public boolean contains(Rectangle r) {
        //r이 현 사각형 안에 있으면 true 리턴
        if(this.x < r.x && this.y < r.y) {
            if(this.x+this.width > r.x+r.width && this.y+this.height > r.y+r.height)
                return true;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}
