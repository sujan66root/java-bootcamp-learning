package Inheritance;

public class inheritance {
    public static void main(String[] args) {

    }
}
class Base{
    int x;

    public Base() {
        this.x = -1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derive extends Base{
    int y;
    public Derive(int u) {
        super();
        this.y = u;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


